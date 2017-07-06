import scala.annotation.tailrec

object ElectionResults {

  def parseLine(line: String): Constituency = {
    val firstSplit = line.split(",")
    println(firstSplit.toList.toString())
    val partiesCounts = firstSplit.tail.toList

    @tailrec
    def extractParties(list: List[String], endList: List[(Party, Int)]): List[(Party, Int)] = {
      if (list.isEmpty) endList
      else extractParties(list.tail.tail, endList :+ (Party(list.tail.head.trim), list.head.trim.toInt))
    }

    val name: String = firstSplit.head
    Constituency(name, extractParties(partiesCounts, List()))
  }

}

case class Constituency(name: String, parties: List[(Party, Int)]) {

  val totalVotes = parties.map(x => x._2).sum

  def percentageOfTotal(number: Int): Double = {
    (number.toDouble / totalVotes) * 100
  }

  val percentageByParty: List[(Party, Double)] = parties.map(x => (x._1, percentageOfTotal(x._2)))

}


case class Party(code: String) {
  val name: String = code match {
    case "C" => "Conservative Party"
    case "L" => "Labour Party"
    case "UKIP" => "UKIP"
    case "LD" => "Liberal Democrats"
    case "G" => "Green Party"
    case "Ind" => "Independent"
    case "SNP" => "SNP"
    case _ => throw new Exception("Unknown party")
  }
}

//C - Conservative Party
//  L - Labour Party
//  UKIP - UKIP
//LD - Liberal Democrats
//  G - Green Party
//  Ind - Independent
//SNP - SNP
