object BabylonianSquareRoot extends App {

  def sqrt(r: Int, x: Int = 1): Int = {
    if (x * x != r)
      sqrt(r, (x + (r / x)) / 2)
    else
      x
  }
  println(sqrt(207936))
}
