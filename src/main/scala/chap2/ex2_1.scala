package chap2

import scala._

/**
  * Created by haoyuan on 12/29/2015.
  */
object ex2_1 extends App {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, acc: Int, prev: Int): Int= {
      if(n == 0) acc
      else loop(n-1, acc + prev, acc)
    }
    loop(n,0,1)
  }


  /* we actually need an accumulator to tail rec this call */
  def fibonacciList(n: Int) : List[Int] = {
    if(n == 0) Nil
    else fib(n) :: fibonacciList(n-1)
  }

  println(fibonacciList(10).reverse)
}
