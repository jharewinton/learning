import scala.annotation.tailrec

def cheat(arr:List[Int]):Int = arr.length

def f[A](arr:List[A]):Int = {
  @tailrec
  def recursive(list: List[A], count: Int): Int = {
    if (list.isEmpty) count
    else recursive(list.tail, count + 1)
  }
  recursive(arr, 0)
}

f(List(1,2))

def ff[A](arr: List[A]): Int = {
  arr.foldRight(0)((_, count) => count + 1)
}

