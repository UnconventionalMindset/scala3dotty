// Simple Scala script

@main def ciao(): Unit =
  printAll(Seq(1, 2, 3):_*)

def printAll(ints: Int*) =
  ints.foreach(println)