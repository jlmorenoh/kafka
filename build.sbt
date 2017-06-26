name := "KafkaConsumer"

version := "1.0"

organization := "com.ustglobal"

scalaVersion := "2.11.8"

resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "2.0.0" % "provided",
"org.apache.spark" % "spark-sql_2.11" % "2.1.0" % "provided",
"org.apache.spark" %% "spark-streaming" % "2.0.0" % "provided",
"org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.0.0"
)

assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}
