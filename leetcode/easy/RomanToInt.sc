//https://leetcode.com/problems/roman-to-integer/description/

def romanToInt(s: String): Int = {
  val mappings: Map[Char, Int] = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000
  )

  def sumRomans(maps: List[Int]): Int = {
    @scala.annotation.tailrec
    def recursiveSum(values: List[Int], sum: Int): Int = {
      if (values.isEmpty) sum else {
        if (values.length == 1) sum + values.head else {
          val nextValue = values.tail.head
          if (nextValue == 5 && values.head == 1) recursiveSum(values.tail.tail, sum + (nextValue - values.head))
          else recursiveSum(values.tail, sum + values.head)
        }
      }
    }

      recursiveSum(maps, 0)
  }

  sumRomans(s.map(x => mappings(x)).toList)
}

romanToInt("III")
romanToInt("CX")
romanToInt("IV")
romanToInt("IX")