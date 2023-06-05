package com.playground
package lesson.one

object CallByValueOrName extends App {

  def callByValue(x: Long) : Unit = {   // here the Syste.nonoTime() is evaluvated and then the value is passed
    println(" call by val " + x)
    println(" call by val " + x)
  }

  def callByName(x: => Long) : Unit = {      // here the execution happens when actually execution it
    println(" call by name " + x)
    println(" call by name " + x)
  }


  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  def anotherFunc(x: Int, y: => Int) : Unit = println(x)

  // anotherFunc(infinite(), 34)
  /**
   * the above gives an error, as the first param x is passed by value
   * so the infinite function is executed, hense it is never ending it gives stack overflow
   */

  anotherFunc(34, infinite())

  /**
   * here as the y is pass by value and it will only be executed in the method impl and
   * as the implementation does not use y  but only use X.  This will give 34 without any error.
   * infinte() will never be invoked.
   */




}
