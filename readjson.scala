package Demo

import scala.io._
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

object readjson {
  {
    "first_name": "Anita",
    "last_name": "Ram",
    "birth_year": 1973
  }
  val jsonString = os.read(os.pwd/"src"/"test"/"resources"/"anita.json")
  val data = ujson.read(jsonString)
  data.value //LinkedHashMap("first_name" -> Str("Anita"), "last_name" -> Str("Ram"), "birth_year" -> Num(1973.0))
}