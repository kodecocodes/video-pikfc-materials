import kotlin.math.atan

// 2-05 Delegated Properties - Starter

class Circle(var radius: Double = 0.0) {
  val pi: Double = ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0
  val circumference: Double
    get() = pi * radius * 2
}

class Level(val id: Int,
            val boss: String,
            var unlocked: Boolean = false) {
  companion object {
    var highestLevel = 0
  }
}

fun main() {
  val level1 = Level(id = 1, boss = "Outside Cat")
  val level2 = Level(id = 2, boss = "Laser Pointer")
  val level3 = Level(id = 3, boss = "Mysterious Attic Sound")
  val level4 = Level(id = 4, boss = "Vacuum Cleaner")

  level1.unlocked = true
  println("Highest Level is ${Level.highestLevel}")
}