import scala.collection.mutable.ListBuffer

/* Task
https://www.hackerrank.com/challenges/30-review-loop
 */

def f(word: String): String = {
  var evenList = new ListBuffer[Char]()
  var oddList = new ListBuffer[Char]()
  for (i <- 0 to word.length-1) {
    if (i % 2 == 0) evenList += word.charAt(i)
    else oddList += word.charAt(i)
  }
  s"${evenList.toList.mkString} ${oddList.toList.mkString}"
}

f("Hacker")
f("Rank")

def f2(word: String) = {
  val (evens, odds) = word.toList.zipWithIndex.partition{ case (c,i) =>
    i % 2 == 0
  }
  s"${evens.map(_._1).mkString} ${odds.map(_._1).mkString}"
  /* _._1 is same as tuple_.1 */
}

f2("Hacker")