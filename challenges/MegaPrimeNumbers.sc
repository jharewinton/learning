// https://www.hackerrank.com/contests/w29/challenges/megaprime-numbers

def isPrime(x: Int): Boolean = if (x < 2) false else (2 until x).forall(x % _ != 0)

def f(first: Int, last: Int): Int = {
  def isPrime(x: Int): Boolean = if (x < 2) false else (2 until x).forall(x % _ != 0)
  (first to last).filter(isPrime(_)).filter(n => n.toString.map(_.asDigit).forall(isPrime(_))).size
}

f(1, 100)

