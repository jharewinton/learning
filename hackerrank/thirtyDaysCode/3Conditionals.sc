def check(number: Int): String = {
  if (number % 2 != 0) "Weird"
  else if (number >= 2 && number <= 5) "Not Weird"
  else if (number >= 6 && number <= 20) "Weird"
  else "Not Weird"
}

check(24)