import kotlin.properties.Delegates

// 2-06 Challenge - Delegated Properties - Final

/*
Challenge 1:
 Rewrite the `IceCream` class below:
 1. Use a default value for the name property.
 2. Lazily initialize the `ingredients` list.
*/

class IceCream {
  var name: String = "Vanilla"
  val ingredients: ArrayList<String> by lazy {
    arrayListOf()
  }
}

/*
Challenge 2:
Below is a `SpaceCar` and `SpaceBattery` class.
Dive into the inner workings of the car and rewrite the `SpaceBattery` class
below with delegated property observer functionality:

1. Add a `lowCharge` property of Boolean type to the class.
2. Flip the `lowCharge` Boolean when the `level` drops below 10%.
3. Ensure that when the battery charges back up, the `lowCharge` warning will turn off.
4. Add a `SpaceBattery` property to `SpaceCar`, make one, and charge it up. Then fly around for awhile.
*/

class SpaceCar(
    val make: String,
    val color: String,
    val battery: SpaceBattery = SpaceBattery()
)

class SpaceBattery {
  var lowCharge = true
  var level: Double by Delegates.observable(0.0) {
    _, _, new ->
    lowCharge = new < 0.1
  }
}



fun main() {
  // ~~~Challenge 1~~~
  // Make a new instance of IceCream
  val spaceIceCream = IceCream()

  // Give it a name other than the default
  spaceIceCream.name = "Comets & Cream"

  // Add some ingredients!
  spaceIceCream.ingredients.add("Crushed Halley's Comet Pieces")
  spaceIceCream.ingredients.add("Milky Way Cream")

  // ~~~Challenge 2~~~
  // Make a SpaceCar!
  val spceTrk = SpaceCar("Tesla", "Space Metal")

  // Charge the battery!
  spceTrk.battery.level = 1.0
  println(spceTrk.battery.lowCharge)

  // Fly around for a while.
  spceTrk.battery.level = 0.05
  println(spceTrk.battery.lowCharge)

}