import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sqrt

// 2-08 Extension Properties & Methods - Starter

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

class Circle(var radius: Double = 0.0) {
  val circumference: Double
    get() = PI * radius * 2
}

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


// Add Circle Extension Property




//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

class SimpleDate(var month: String) {
  fun monthsUntilJingleBells(): Int {
    return months.indexOf("December") - months.indexOf(month)
  }

  companion object {
    val months = arrayOf(
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    )
  }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


// Add SimpleDate Extension Method




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


// Add TVMath Companion Object Extension Method



fun main() {

}