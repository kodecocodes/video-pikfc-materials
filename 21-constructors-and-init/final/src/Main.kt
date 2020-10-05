// 3-05 Constructors & Init - Final

data class Grade(val courseName: String, val letter: Char)

open class Student(var firstName: String, var lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()) {
  open fun recordGrade(grade: Grade) {
    grades.add(grade)
  }
}

class BandMember(firstName: String, lastName: String): Student(firstName, lastName) {
  var minimumPracticeTime: Int = 2
  val isEligible
    get() = grades.none { it.letter == 'F' }

  constructor(firstName: String, lastName: String, minimumPracticeTime: Int): this(firstName, lastName) {
    this.minimumPracticeTime = minimumPracticeTime
  }

  constructor(transfer: BandMember): this(transfer.firstName, transfer.lastName, transfer.minimumPracticeTime) {
    grades = transfer.grades
    if (!isEligible) minimumPracticeTime += 1
    println("(transfer constructor) Practice for $minimumPracticeTime hours!")
  }

  init {
    if (!isEligible) minimumPracticeTime += 1
    println("(init) Practice for $minimumPracticeTime hours!")
  }

  init {
    if (!isEligible) minimumPracticeTime += 1
    println("(init2) Practice for $minimumPracticeTime hours!")
  }
}

fun main() {
  val bill = BandMember(firstName = "Bill", lastName = "S. Preston, Esq.")

  bill.recordGrade(Grade(courseName = "Motivational Speaking", letter = 'A'))
  bill.recordGrade(Grade(courseName = "Guitar 101", letter = 'F'))

  val transferredBill = BandMember(transfer = bill)
  println(transferredBill.grades)

  val ted = BandMember(firstName = "Ted", lastName = "Theodore Logan", minimumPracticeTime = 7)
}