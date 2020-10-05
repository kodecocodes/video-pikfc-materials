// 4-05 Challenge Enum Classes - Final

/*
Challenge - Transform SimpleDate into an Enum Class!
- Make it an Enum Class and call it `Month` instead of `SimpleDate`
- Turn that months array into the enum cases
- Get the monthsUntilJingleBells and monthsUntilHalloweenDecorations methods working again
- Write a new property named `season` with a custom getter that will return the season of the year
for each month. (Maybe model `Season` as another Enum Class?)
*/

enum class Season {
  Winter, Spring, Summer, Autumn
}

enum class Month {
  January, February, March, April, May, June,
  July, August, September, October, November, December;

  val season: Season
    get() =
      when (this) {
        December, January, February -> Season.Winter
        March, April, May -> Season.Spring
        June, July, August -> Season.Summer
        September, October, November -> Season.Autumn
      }

  fun monthsUntilJingleBells(): Int {
    return December.ordinal - this.ordinal
  }

  fun monthsUntilHalloweenDecorations(): Int {
    val halloweenStart = September
    val halloweenEnd = October

    return when (this) {
      in January..halloweenStart -> halloweenStart.ordinal - this.ordinal
      in halloweenStart..halloweenEnd -> 0
      else -> halloweenStart.ordinal + (values().count() - this.ordinal)
    }
  }
}

fun main() {
  val july = Month.July
  println(july.monthsUntilJingleBells())
  println(july.monthsUntilHalloweenDecorations())

  println(july.season)
  println(Month.September.season)
}