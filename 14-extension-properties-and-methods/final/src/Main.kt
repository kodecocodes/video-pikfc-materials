import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sqrt

// 2-08 Extension Properties & Methods - Final

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class Circle(var radius: Double = 0.0) {
  val circumference: Double
    get() = PI * radius * 2
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


val Circle.diameter: Double
  get() = 2.0 * radius



//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class SimpleDate(var month: String) {
  fun monthsUntilJingleBells(): Int {
    return months.indexOf("December") - months.indexOf(month)
  }

  companion object {
    val months = arrayOf(
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    )
  }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

fun SimpleDate.monthsUntilHalloweenDecorations(): Int {
  val currentMonth = SimpleDate.months.indexOf(month)
  val halloweenStart = SimpleDate.months.indexOf("September")
  val halloweenEnd = SimpleDate.months.indexOf("October")

  return if (currentMonth in 0..halloweenStart) {
    halloweenStart - currentMonth
  } else if (currentMonth in halloweenStart..halloweenEnd) {
    0
  } else {
    halloweenStart + (12 - currentMonth)
  }
}



//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class TVMath {
  companion object {
    fun getDiagonal(width: Double, height: Double): Int {
      val result = sqrt(width * width + height * height)
      return result.roundToInt()
    }

    fun getWidthAndHeight(diagonal: Int, ratioWidth: Double, ratioHeight: Double): Pair<Double, Double> {
      val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
      val height = diagonal * ratioHeight / ratioDiagonal
      val width = height * ratioWidth / ratioHeight

      return Pair(width, height)
    }
  }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

fun TVMath.Companion.idealViewingDistance(diagonal: Int, is4K: Boolean): Double {
  return if (is4K) diagonal * 1.25 else diagonal * 2.0
}

fun main() {
  val distance = TVMath.idealViewingDistance(diagonal = 65, is4K = true)
  println("Sit $distance inches away.")

  val date = SimpleDate("August")
  println("${date.monthsUntilHalloweenDecorations()} month(s) until spooky decorations!")

  val unitCircle = Circle(1.0)
  println("diameter: ${unitCircle.diameter}")
}