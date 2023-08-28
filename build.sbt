

lazy val root = (project in file("."))
  .settings(
    name := "ScalaApp",
    scalaVersion := "2.12.17",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.4.1" % "provided" from s"file:/D:/spark-3.4.1-bin-hadoop3/jars/spark-core_2.12-3.4.1.jar",
      "org.apache.spark" %% "spark-sql" % "3.4.1" % "provided" from s"file:/D:/spark-3.4.1-bin-hadoop3/jars/spark-sql_2.12-3.4.1.jar"

    )
  )


// Assembly settings
assemblyJarName in assembly := "ScalaApp.jar"
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
