// 2-07 Methods - Starter

val months = arrayOf(
    "January", "February", "March",
    "April", "May", "June",
    "July", "August", "September",
    "October", "November", "December"
)

class SimpleDate(var month: String)

fun monthsUntilJingleBells(from: SimpleDate): Int {
  return months.indexOf("December") - months.indexOf(from.month)
}

fun main() {

}