import org.scalatest.{FunSuite, Matchers}

class ElectionResultsTests extends FunSuite with Matchers {

  test("Lib dem party code returns expected") {
    Party("LD").name should be ("Liberal Democrats")
  }

  test("UKIP party code returns expected") {
    Party("UKIP").name should be ("UKIP")
  }

  test("Invalid code should error") {
    assertThrows[Exception](Party("Blah").name)
  }

  val testFeed = "Cardiff West, 11014, C, 17803, L, 4923, UKIP, 2069, LD"
  val constituency = ElectionResults.parseLine(testFeed)


  test("Constituency name is created as expected") {
    ElectionResults.parseLine(testFeed).name should be ("Cardiff West")
  }

  test("First party and count are correct") {
    val firstParty = constituency.parties.head
    firstParty._1.name should be ("Conservative Party")
    firstParty._2 should be (11014)
  }

  test("Last party and count are correct") {
    val lastParty = constituency.parties.last
    lastParty._1.name should be ("Liberal Democrats")
    lastParty._2 should be (2069)
  }

  test("Total votes are correct") {
    constituency.totalVotes should be (35809)
  }

  test("percentage of votes are correct") {
    constituency.percentageByParty.head._2.toString should startWith ("30.75")
  }

}
