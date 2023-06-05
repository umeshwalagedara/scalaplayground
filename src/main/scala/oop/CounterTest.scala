package com.playground
package oop

object CounterTest extends App {

  val couut = new Counter(5);
  println(couut.currentCount())
  println(couut.incrementCount().count)

  println(couut.decrementCount().count)

  println(couut.incrementCount(5).count)
  println(couut.decrementCount(2).count)

}


class Counter(val i:Int){

  var count = i;

  def currentCount(): Int = {
    count
  }

  def incrementCount(): Counter = new Counter(count + 1)

  def decrementCount() : Counter = new Counter(count - 1)

  def incrementCount(sum : Int) = new Counter( count + sum)

  def decrementCount(sum : Int) = new Counter(  count - sum)


}
