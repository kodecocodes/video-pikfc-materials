// 4-03 Enum Classes - Final

enum class DayOfTheWeek(val isWeekend: Boolean = false) {
  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday(true), Sunday(true);

  fun daysUntil(other: DayOfTheWeek): Int {
    if (this.ordinal < other.ordinal) {
      return other.ordinal - this.ordinal
    } else {
      return other.ordinal - this.ordinal + DayOfTheWeek.values().count()
    }
  }
}

fun main() {
  for (day in DayOfTheWeek.values()) {
    println("Day ${day.ordinal}: ${day.name}, is weekend: ${day.isWeekend}")
  }

  val friday = DayOfTheWeek.Friday
  println(DayOfTheWeek.Tuesday.daysUntil(friday))
}