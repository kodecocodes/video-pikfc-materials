// 3-07 Interfaces - Final

interface Vehicle {
  fun accelerate()
  fun stop()
}

class Unicycle: Vehicle {
  var peddling = false

  override fun accelerate() {
    peddling = true
    println("Weeeeee")
  }

  override fun stop() {
    peddling = false
    println("Noooooo")
  }
}

enum class Direction {
  LEFT, RIGHT
}

interface TurningVehicle: Vehicle {
  fun turn(direction: Direction = Direction.RIGHT)
  fun description(): String
}

interface Spacey {
  val tribblesCount: Int
}

interface SpaceVehicle: Vehicle, Spacey {
  val name: String
    get() = "SpaceVehicle"

  override fun accelerate() { println("Proceed to Hyperspace!") }
  override fun stop() { println("Whoa, slow down!") }
}

class LightFreighter: SpaceVehicle {
  override val tribblesCount: Int = 0

  var hyperdriveBusted: Boolean = false
  override fun stop() {
    hyperdriveBusted = true
    println("Hyperdrive Failure... again")
  }
}

class Starship: SpaceVehicle {
  override val tribblesCount: Int
    get() = Int.MAX_VALUE

  override val name: String
    get() = "Starship!"

  override fun accelerate() {
    println("Warp factor 9, please!")
  }

  override fun stop() {
    super.stop()
    println("That kind of hurt...")
  }
}

fun main() {
  val unicycle = Unicycle()
  unicycle.accelerate()
  unicycle.stop()

  val falcon = LightFreighter()
  falcon.accelerate()
  falcon.stop()

  val enterprise = Starship()
  enterprise.accelerate()
  enterprise.stop()
}