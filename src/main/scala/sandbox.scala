import spray.json.DefaultJsonProtocol

import spray.json._
//https://github.com/spray/spray-json

case class Person(firstName: String, lastName: String, age: Int)

object MyJsonProtocol extends DefaultJsonProtocol {
	implicit val personFormat = jsonFormat3(Person)
}

object sandbox extends App {
	import MyJsonProtocol._



	val datafile = scala.io.Source.fromResource("personData.json")
	datafile.bufferedReader().lines().forEach(l => println(l))
	println(datafile)
	val linesFile = datafile.bufferedReader().lines()
	println(linesFile)
	var p_list: Seq[Person] = Seq{Person("Sharon", "Langer",3)}
//	p_list = linesFile.map(i => p_list.appended(i.))
//	val json = Person("Sharon", "Langer",3).toJson
//	println(json.prettyPrint)
//	val p = json.convertTo[Person]
}
