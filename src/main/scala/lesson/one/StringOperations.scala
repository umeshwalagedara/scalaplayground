package com.playground
package lesson.one

object StringOperations extends App {

  val str: String = "This is my String"

  println(str.charAt(2))
  println(str.reverse)
  println(str.substring(0, 5))
  println(str.split(" ").toList)

  val str1 = "34"
  val intval = str1.toInt
  println(intval)

  println('a' +: str1 :+ 'b')    //  prepending and appening    +:   :+
  println(str.take(2))           // take this number of char

   // scala specific

   // s - interpolator

   val name = "umesh"
   val age = 40

  // s - interpolator
  println(s"my name is $name and age is $age")
  println(s"my name is $name and age will be ${age + 1 }")   // you can do operations as well

  // f - interpolator   -   you can format as well
  println(f"my name is $name%s and age is $age%2.3f")

  // row - interpolator
  val astring =  "this is my text \n and it is big"
  println(astring)                                   // this will break the sentence into two lines
  println(raw"this is my text and \n it is big")    // this will print considering full as a string literal

  println(raw"$astring")                          // this will break the sentence into two





}
