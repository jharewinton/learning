def multiples(n: Int) = {
  for (i <- 1 to 10) {
    println(s"$n x $i = ${n*i}")
  }
}

multiples(2)