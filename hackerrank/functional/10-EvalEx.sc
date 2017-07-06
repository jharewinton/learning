import scala.annotation.tailrec
import scala.math.pow

def f(x: Double): Double = {
  def fact(n: Double): Double = {
    if (n == 0) 1
    else n * fact(n - 1)
  }
  @tailrec
  def total(count: Int, current: Double): Double = {
    if (count == 10) current
    else total(count + 1, current + (pow(x, count) / fact(count)))
  }
  1 + x + total(2, 0)
}

f(20.0000)
f(5.0000)
f(0.5000)
f(-0.5000)
