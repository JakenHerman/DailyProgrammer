import scala.collection.JavaConversions._

object Dna_pairs {

  def main(args: Array[String]) {
    val strand_1 = "AATGCCTATGGC"
    val pair: String = null
    for (i <- 0 until strand_1.length) {
      val c = strand_1.charAt(i)
      val C = java.lang.Character.toString(c)
      if (C == "A") {
        println("A T")
      } else if (C == "T") {
        println("T A")
      } else if (C == "G") {
        println("G C")
      } else if (C == "C") {
        println("C G")
      } else {
        println("ERROR")
      }
    }
  }
}
