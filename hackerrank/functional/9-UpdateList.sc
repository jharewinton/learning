import scala.math.abs

def f(arr:List[Int]):List[Int] = {
  arr.map(x => abs(x))
}