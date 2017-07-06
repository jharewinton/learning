def f(n: Array[Int], d: Int): Array[Int] = {
  val x = n.toList.splitAt(n.length - d)
  (x._2 ::: x._1).toArray
}

f(Array(1,2,3,4,5), 4)