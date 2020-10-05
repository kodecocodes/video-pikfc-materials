// 4-02 Objects - Starter

data class Student(val id: Int, val firstName: String, val lastName: String) {
  var fullName = "$lastName, $firstName"
}


fun main() {
  val francisco = Student(1, "Francisco", "Goya")
  val sal = Student(2, "Salvador", "Dalí")
  val frida = Student(3, "Frida", "Kahlo")

}