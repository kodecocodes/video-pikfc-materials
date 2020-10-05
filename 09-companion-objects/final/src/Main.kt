// 2-03 Companion Object Properties & Methods - Final
import kotlin.math.roundToInt
import kotlin.math.sqrt

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

class TV(var width: Double, var height: Double) {
  var diagonal: Int
    get() {
      return TVMath.getDiagonal(width, height)
    }
    set(value) {
      val size = TVMath.getWidthAndHeight(diagonal = value, ratioWidth = 16.0, ratioHeight = 9.0)
      width = size.first
      height = size.second
    }
}

class Level(val id: Int,
            val boss: String,
            var unlocked: Boolean) {
  companion object {
    var highestLevel = 1
  }
}

fun main() {
  val level1 = Level(id = 1, boss = "Outside Cat", unlocked = true)
  val level2 = Level(id = 2, boss = "Laser Pointer", unlocked = false)
  val level3 = Level(id = 3, boss = "Mysterious Attic Sound", unlocked = false)
  val level4 = Level(id = 4, boss = "Vacuum Cleaner", unlocked = false)

//  println("Highest Level is ${level2.highestLevel}")
  println("Highest Level is ${Level.highestLevel}")

  val tv = TV(width = 95.87, height = 53.93)
  println(tv.diagonal)

  tv.width = tv.height
  println(tv.diagonal)

  tv.diagonal = 65
  println("That'll be ${tv.width} inches wide!")
}