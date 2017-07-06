def f(word: String): Boolean = {
  if (word.reverse == word) true
  else false
}

f("hello")
f("civic")
f("radar")