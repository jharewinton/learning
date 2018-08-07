//https://leetcode.com/problems/reverse-integer/description/

def reverse(x: Int): Int = {
    try {
      val a = x.toString.toList
      if (a.head == '-'){
        ("-" + a.tail.reverse.mkString).toInt
      } else a.reverse.mkString.toInt
    } catch {
      case e: NumberFormatException => 0
    }
}

reverse(123)
reverse(120)
reverse(-345)
reverse(964632435 * 10)