def f(x: Int): Int = {
  if (x == 0) 1
  else x * f(x-1)
}

f(5)