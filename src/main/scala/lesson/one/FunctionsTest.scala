package com.playground
package lesson.one

object FunctionsTest extends App {


  def aStringConctFunc(name: String, age: Int): String = {
    "my name is " + name + " and age is " + age
  }

  println(aStringConctFunc("umesh", 40))


  def factorialCalc(num : Int): Int = {
    if(num <= 0) 1
    else num * factorialCalc(num - 1)
  }

  println(factorialCalc(5));


}
