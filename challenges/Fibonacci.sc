import scala.annotation.tailrec
// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers

def f(n: Int): Int = {
  @tailrec
  def fib(x: List[Int], acc: Int, end: Int): List[Int] = {
    if (acc == end) x
    else fib(x :+ x(x.length - 1) + x(x.length - 2), acc +1, end)
  }
//  fib(List(0,1), 1, n)(n-1)
  val sequence = fib(List(0,1), 2, n)
  println(sequence)
  sequence(n-1)
}

f(3)
f(4)
f(5)
f(10)