def f(arr:List[Int]): Int = {
  arr.filter(x => x % 2 != 0).sum
}

f(List(3,2,4,6,5,7,8,0,1))