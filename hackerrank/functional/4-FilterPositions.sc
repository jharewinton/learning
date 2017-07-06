def f(arr:List[Int]):List[Int] = {
  arr.zipWithIndex.map(x => (x._1, (x._2 + 1))).filter(_._2 % 2 == 0).map(_._1)
}

f(List(2,5,3,4,6,7,9,8))