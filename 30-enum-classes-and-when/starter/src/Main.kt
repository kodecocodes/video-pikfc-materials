// 4-04 Enum Classes & When - Starter

enum class DayOfTheWeek(val isWeekend: Boolean = false) {
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Saturday(true),
  Sunday(true);

  fun daysUntil(other: DayOfTheWeek): Int {
    if (this.ordinal < other.ordinal) {
      return other.ordinal - this.ordinal
    } else {
      return other.ordinal - this.ordinal + DayOfTheWeek.values().count()
    }
  }
}

fun main() {

}