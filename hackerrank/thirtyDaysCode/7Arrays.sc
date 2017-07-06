def f(array: Array[Int]): String = {
  array.reverse.map(x => s"$x ").mkString
}

val x = Array(1,4,3,2)
f(x)