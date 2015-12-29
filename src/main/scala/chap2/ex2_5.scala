package chap2

/**
  * Created by haoyuan on 12/29/2015.
  */
object ex2_5 {
  def compose[A,B,C](f: B=>C, g: A=>B) : A=>C = {
    x => f(g(x))
  }
}
