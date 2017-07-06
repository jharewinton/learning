import scala.annotation.tailrec

def f(num:Int,arr:List[Int]):List[Int] = {
  @tailrec
  def replicate(values: List[Int], location: Int): List[Int] = {
    if (values.length == num) values
    else replicate(values :+ values.head, location + 1)
  }
  arr.flatMap(x => replicate(List(x), 1))
}

f(3, List(1,2,3,4,5))