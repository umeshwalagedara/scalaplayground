package com.playground
package lesson.one

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(1 + 2 * 3)   //  + 1 * / ^

  // loops..   NEVER use this in scala
  var i = 0;
  while (i < 10){
    println(i)
    i += 1;
  }

  // every thing in scala is an expression
  var avar = 5
  val aValue = (avar = 3)   //  avar = 3  is reassigning a variable. and it is a side effect
                            // side effects in scala are expressions returning unit
  println(aValue)            // ()    unit === void


  // code blocks
  val aCodeBlock = {
    val y = 2;
    val x = y + 3;

    if(x > y) "hello" else "good bye"
  }

  // var s =  y + 4        // Y is not visible to outside
  // code block is also an expresesion which evaluvates to the last expression of it.
  // here this code block is returning a String

  




}
