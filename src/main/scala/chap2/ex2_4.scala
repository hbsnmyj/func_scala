package chap2

/**
  * Created by haoyuan on 12/29/2015.
  */
object ex2_4 {
  def uncurry[A,B,C](f: A=>B=>C) : (A,B)=>C = {
    (a,b) => f(a)(b)
  }
}
