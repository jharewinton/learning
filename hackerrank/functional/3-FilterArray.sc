def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)

f(3, List(1,5,7,2,6,2,1))