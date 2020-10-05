// 3-05 Constructors & Init - Starter

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
}


fun main() {

}