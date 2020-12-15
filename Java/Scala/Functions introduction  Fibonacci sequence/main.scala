object Fibonacci extends App {
  val a = 0
  val b = 1
  def sum(a: Int, b: Int): Int = a + b

  println(a)
  println(b)
  println(sum(a, b))
  println(sum(sum(a , b) , b))
  println(sum(sum(sum(a , b), b),b))
}
