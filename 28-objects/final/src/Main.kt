// 4-02 Objects - Final

data class Student(val id: Int, val firstName: String, val lastName: String) {
  var fullName = "$lastName, $firstName"
}

object StudentRegistry {
  val allStudents = mutableListOf<Student>()

  fun addStudent(student: Student) {
    allStudents.add(student)
  }

  fun removeStudent(student: Student) {
    allStudents.remove(student)
  }

  fun listAllStudents() {
    allStudents.forEach {
      println(it.fullName)
    }
  }
}

fun main() {
  val francisco = Student(1, "Francisco", "Goya")
  val sal = Student(2, "Salvador", "Dalí")
  val frida = Student(3, "Frida", "Kahlo")

  StudentRegistry.addStudent(francisco)
  StudentRegistry.addStudent(sal)
  StudentRegistry.addStudent(frida)

  StudentRegistry.listAllStudents()
}