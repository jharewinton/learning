class Person(firstName: String, lastName: String, id: Int) {

  def printPerson(): Unit = {
    println(
      s"""Name: $lastName, $firstName
         |ID: $id
       """.stripMargin
    )
  }
}

class Student(firstName: String, lastName: String, id: Int, scores: List[Int]) extends Person(firstName = firstName, lastName = lastName, id = id) {

  override def printPerson() = {
    println(
      s"""Name: $lastName, $firstName
         |ID: $id
         |Grade: ${calculate}
       """.stripMargin)
  }

  def calculate: Char = {
    scores.sum / scores.length match {
      case x if (x >= 90 && x <= 100) => 'O'
      case x if (x >= 80 && x < 90) => 'E'
      case x if (x >= 70 && x < 80) => 'A'
      case x if (x >= 55 && x < 70) => 'P'
      case x if (x >= 40 && x < 55) => 'D'
      case _ => 'T'
    }
  }
}

new Student("Heraldo", "Memelli", 8135627, List(100,80)).printPerson()