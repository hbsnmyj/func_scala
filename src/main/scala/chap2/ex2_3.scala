package chap2

/**
  * Created by haoyuan on 12/29/2015.
  */
object ex2_3 {
  def curry[A,B,C](f: (A, B)=>C) : A => B => C = {
    a => f(a, _)
  }
}
