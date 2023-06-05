package com.playground
package lesson.one

object Recursion  extends App {

  def calFactorial(n: BigInt): BigInt = {

    if (n <= 1) 1
    else {
      println("calculating the fac of " + n)
      val result = n * calFactorial(n - 1)
      println(" calculated the fac of  " + n + " and it is " + result)
      result
    }
  }

  // println(calFactorial(20000));


  def calFacAnother(n: BigInt) : BigInt = {
    def facHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else facHelper(x - 1, x * accumulator)

    facHelper(n, 1)
}

 println(calFacAnother(10))


  /**
   *  facHelper(10 , 1)
   *  facHelper(9 , 10 * 1)
   *  facHelper(8, 9 * 10 * 1)
   *  facHelper(7, 8 * 9 * 10 * 1)
   *  facHelper(6, 7 * 8 * 9 * 10 * 1)
   *
   */

  def concatString(str: String, n : Int) : String = {
    def concatHelper(str: String, n: Int, accumulater: String): String =
      if (n <= 1) accumulater
      else concatHelper(str, n - 1, str + accumulater)

    concatHelper(str, n, str);
  }

  println(concatString("abc" , 1))


  // prime numbers -  that are devided by 1 and itself only

   // try and do the prime number
   // fibonacci number


}
