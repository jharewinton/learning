val ourList = List(1, 1, 2, 3, 5, 8)

ourList.reverse.head

def last(list: List[Int]): Int = {
  @scala.annotation.tailrec
  def checkNext(x: List[Int]): Int = {
    if (x.tail.isEmpty) x.head
    else checkNext(x.tail)
  }
  checkNext(list)
}

last(ourList)

last((0 to 10000).toList)