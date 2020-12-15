object CharacterGame extends App {

  val triple = (
    scala.io.StdIn.readChar(),
    scala.io.StdIn.readInt(),
    scala.io.StdIn.readBoolean()
  )
  val expected = (
    triple._1,    
    triple._1.toInt,
    triple._1.isUpper
  )
  println(triple == expected)        
}
