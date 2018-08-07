import scala.annotation.tailrec
//
//def f(a: String, b: String): Int = {
//  def x(word: String) = word.toList.groupBy(identity).mapValues(_.size).toList
//  val y = x(a)
//  val z = x(b)
//
//  val yCut = y.filter(!z.contains(_))
//  val zCut = z.filter(!y.contains(_))
//
//  val yDiffs = yCut.filter(x => !b.toList.contains(x._1)).map(x => x._2).sum
//  val zDiffs = zCut.filter(x => !a.toList.contains(x._1)).map(x => x._2).sum
//
//  val yCutDupes = y.filter(x => x._2 > 1).sortBy(_._1)
//  val zCutDupes = z.filter(x => x._2 > 1).sortBy(_._1)
//
//  @tailrec
//  def d(first: List[(Char, Int)], secondList: List[(Char, Int)], counter: Int): Int = {
//    println("Counter = " + counter)
//    if (first.isEmpty) counter
//    else d(first.tail, secondList.tail, if (first.head._2 >= secondList.head._2) { first.head._2 - secondList.head._2 } else secondList.head._2 - first.head._2)
//  }
//
//  yDiffs + zDiffs + d(yCutDupes, zCutDupes, 0)
//
//}
//
//f("abc", "cab")
//f("abcd", "dcb")
//f("cde", "abc")
//f("ccbb", "ccc") //TODO: Make this work - function currently doesn't include letters that appear in both words, but a differing number of times


val a = "abcd"
val b = "ccab"

def groupedChars(x: String): List[(Char, Int)] = {
    x.toList
      .groupBy(identity)
      .mapValues(_.size)
      .toList
  }

  val aGrouped = groupedChars(a)
  val bGrouped = groupedChars(b)

  val aCut = aGrouped.filter(!bGrouped.contains(_))
  val bCut = bGrouped.filter(!aGrouped.contains(_))

  val aDiffs = aCut.filter(x => !b.toList.contains(x._1)).map(x => x._2).sum
  val bDiffs = bCut.filter(x => !a.toList.contains(x._1)).map(x => x._2).sum
