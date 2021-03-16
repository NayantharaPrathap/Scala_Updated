package Demo

object filt {
  // Main method
  def main(args:Array[String])
  {
    // Creating map
    val m1 = Map("filter" -> 5, "function" -> 3)
    // Applying filter method
    val result = m1.filter(x => x._1 == "filter" && x._2 == 5)
    // Displays output
    println(result)
  }}