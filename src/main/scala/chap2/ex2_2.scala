package chap2

/**
  * Created by haoyuan on 12/29/2015.
  */
object ex2_2 extends App {

  def isSorted[A](as : List[A], ordered: (A,A)=>Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int) : Boolean = {
      if(n >= as.length - 1) true
      else if(!ordered(as(n), as(n+1))) false
      else loop(n+1)
    }
    loop(0)
  }

  println(isSorted(List(0,1,2,3,4), (x:Int,y:Int) => x < y))
  println(isSorted(List(0,1,4,3,4), (x:Int,y:Int) => x < y))
  println(isSorted(List(0), (x:Int,y:Int) => x < y))
  println(isSorted(List(1), (x:Int,y:Int) => x < y))
  println(isSorted(List(), (x:Int,y:Int) => x < y))
  println(isSorted(List(1,0), (x:Int,y:Int) => x < y))
}
