package chap3

import scala.collection.mutable.ListBuffer

/**
  * Created by haoyuan on 12/30/2015.
  */
trait ex3_2 {
  def tail[A](l: List[A]) : List[A] = l match {
    case Nil => Nil
    case _ :: tail => tail
  }

  def setHead[A](l: List[A], head : A) : List[A] = l match {
    case Nil => Nil
    case old_head :: tail => head :: tail
  }

  def drop[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case old_head :: tail => tail
  }

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case head :: tail => if(!f(head)) l
      dropWhile(tail, f)
  }

  def init[A](l: List[A]): List[A] = {
    val buf = new ListBuffer[A]
    @annotation.tailrec
    def go(l: List[A], n: Int) : List[A] = {
      if(n == 0) buf.toList
      else {
        buf += l.head
        go(l.tail, n-1)
      }
    }
    go(l, l.length)
  }

  /* no not possible */
  def product(l: List[Int]): Int = {
    l.foldRight(1)(_ * _)
  }

}
