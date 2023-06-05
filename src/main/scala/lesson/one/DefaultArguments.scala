package com.playground
package lesson.one

object DefaultArguments extends App {

  def getFactorial(n : Int, accumulater: Int = 1): Int = {
    if(n <= 1 ) accumulater
    else getFactorial(n-1, n * accumulater);
  }

  println(getFactorial(10, 1))


  /**
   * this might create a problem if the default param is the first one
   */

  def printString(str: String = "abc", length: Int, width: Int) : Unit = println(str + length + width)

 // printString(10, 20)    // here this gives error

  printString(length = 20, width = 30)

  printString(length = 30, width = 40, str = "hi hi hi")  // we can even change the order







}
