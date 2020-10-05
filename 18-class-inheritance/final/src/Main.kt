// 3-02 Inheritance - Final

data class Grade(val courseName: String, val letter: Char, val credits: Double)

open class Person(var firstName: String, var lastName: String) {
  fun fullName() = "$firstName $lastName"
}

open class Student(firstName: String, lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()
                   ) : Person(firstName, lastName) {

  fun recordGrade(grade: Grade) {
    grades.add(grade)
  }
}

class BandMember(firstName: String, lastName: String): Student(firstName, lastName) {
  var minimumPracticeTime: Int = 2
}

class StudentAthlete(firstName: String, lastName: String): Student(firstName, lastName) {
  var isEligible: Boolean = true
}

fun main() {
  val jon = Person(firstName = "Jon", lastName = "Snon")
  val jane = Student(firstName = "Jane", lastName = "Snane")
  val victor = BandMember(firstName = "Victor", lastName = "Wooten")
  val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")

  println(jon.fullName())
  println(jane.fullName())
  println("${victor.fullName()} practices for ${victor.minimumPracticeTime} hours!")
  println("Can ${marty.fullName()} play in the big game: ${marty.isEligible}")

  val robotics = Grade(courseName = "Robotics", letter = 'B', credits = 3.0)
  jane.recordGrade(robotics)
  println(jane.grades)
}