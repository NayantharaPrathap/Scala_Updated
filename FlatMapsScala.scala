package Demo

object FlatMapsScala {
  // Main method
  def main(args:Array[String])
  {

    // Creating a sequence of strings
    val portal = Seq("I", "am", "Nayanthara")

    // Applying flatMap
    val result = portal.flatMap(_.toUpperCase)

    // Displays output
    println(result)

  }
}


