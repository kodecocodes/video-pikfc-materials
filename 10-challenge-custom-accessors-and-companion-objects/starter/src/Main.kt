// 2-04 Challenge - Custom Accessors & Companion Objects - Starter

/*
Challenge 1:
Check out the Wizard class below and run the project.
Right now, `fullName` doesn't change when you update a wizard's first or last name.
Change the Wizard's fullName to a read-only computed property to fix that!

**Bonus Challenge**
Add a custom setter that will split a full name into a first and last name.
Only set firstName and lastName if the value contains exactly two names separated by a space
Hint: Use `.split(" ")` to split the value passed in into a list of strings
*/

/*
Challenge 2:
Add a "commonMagicalIngredients" list as a companion object property on Wizard.
Fill it with any magical ingredients you like!
*/

class Wizard(var firstName: String, var lastName: String) {
  val fullName = "$firstName $lastName"
}

fun main() {
  val wizard = Wizard("Hermione", "Sidious")
  println(wizard.fullName)

  wizard.lastName = "Skywalker"
  println(wizard.fullName)
}