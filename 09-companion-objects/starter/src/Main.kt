// 2-03 Companion Object Properties & Methods - Starter
import kotlin.math.roundToInt
import kotlin.math.sqrt

class TV(var width: Double, var height: Double) {
  var diagonal: Int
    get() {
      val result = sqrt(width * width + height * height)
      return result.roundToInt()
    }
    set(value) {
      val ratioWidth = 16.0
      val ratioHeight = 9.0
      val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
      height = value * ratioHeight / ratioDiagonal
      width = height * ratioWidth / ratioHeight
    }
}

fun main() {
  val tv = TV(width = 95.87, height = 53.93)
  println(tv.diagonal)

  tv.width = tv.height
  println(tv.diagonal)

  tv.diagonal = 65
  println("That'll be ${tv.width} inches wide!")
}