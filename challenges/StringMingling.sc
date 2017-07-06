import scala.annotation.tailrec
// https://www.hackerrank.com/challenges/string-mingling?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

def f(p: String, q: String): String = {
  @tailrec
  def t(x: List[Char], y: List[Char], z: String = ""): String = {
    if (x.isEmpty) z
    else (t(x.tail, y.tail, s"$z${x.head}${y.head}"))
  }
  t(p.toList, q.toList)
}

f("hacker", "ranker")
f("abcde", "pqrst")