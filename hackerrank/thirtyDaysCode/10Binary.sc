def f(x: Int) = {
  val xs = x.toBinaryString.toList
  val grouped = (List(xs.take(1)) /: xs.tail) ((l, r) =>
    if (l.head.head == r) (r :: l.head) :: l.tail else List(r) :: l
  ).reverseMap(_.reverse)
  grouped.map(_.size).sorted.last
}

f(5)
f(13)
