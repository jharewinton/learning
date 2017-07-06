val phoneBook: Map[String, Int] = Map("sam" -> 99912222, "tom" -> 11122222, "harry" -> 12299933)

def f(list: List[String]) = {
  list.foreach{ e =>
    phoneBook.get(e) match {
      case Some(x) => println(s"$e=$x")
      case None => println("Not found")
    }
  }
}

f(List("sam", "edward", "harry"))
