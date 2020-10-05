// 2-03 Overriding - Start

data class Grade(val courseName: String, val letter: Char)

open class Person(var firstName: String, var lastName: String) {
  fun fullName() = "$firstName $lastName"
}

open class Student(firstName: String, lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()) : Person(firstName, lastName) {

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
  val victor = BandMember("Victor", "Wooten")
  val marty = StudentAthlete("Marty", "McWolf")
}