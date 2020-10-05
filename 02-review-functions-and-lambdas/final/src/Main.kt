// P01E02 Review - Starter

fun main() {
  fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
  }

  val addLambda = { a: Int, b: Int ->
    a + b
  }

  operateOnNumbers(4, 2) { a, b ->
    a + b
  }

  fun addFunction(a: Int, b: Int) = a + b
  operateOnNumbers(4, 2, operation = Int::plus)
}