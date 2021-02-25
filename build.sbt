name := "scala-sandbox"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= {
	Seq(
		"org.scala-lang.modules" %% "scala-xml" % "1.2.0",
//		"com.sparkjava" %% "spark-core" % "2.9.3",
		"io.spray" %% "spray-json" % "1.3.6",
	)
}

//"org.apache.spark" %% "spark-sql" % sparkV,
//"org.apache.spark" %% "spark-core" % "3.1.0",
//"org.apache.spark" %% "implicits._" %,
//"org.apache.spark" %% "spark-core" % "3.1.0"
