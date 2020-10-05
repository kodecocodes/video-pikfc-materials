// 3-02 Inheritance - Starter

data class Grade(val courseName: String, val letter: Char, val credits: Double)

class Person(var firstName: String, var lastName: String) {
  fun fullName() = "$firstName $lastName"
}

class Student(var firstName: String, var lastName: String,
              var grades: MutableList<Grade> = mutableListOf<Grade>()) {

  fun fullName() = "$firstName $lastName"

  fun recordGrade(grade: Grade) {
    grades.add(grade)
  }
}

fun main() {


}