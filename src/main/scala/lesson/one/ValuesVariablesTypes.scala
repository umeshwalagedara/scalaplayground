package com.playground
package lesson.one

object ValuesVariablesTypes extends App {

  val x: Int = 42;
  println(x);
  // x = 2   not allowed -   val are immutable

  val y = 50
  println(y);

  val aString: String = "abc"   // in scala ;  is not necessary.  But if you are typing in one line then u need ;

  val bString: String = "abc";  val testVar: Int = 34    // here if on the same line you need the ;

  val bool: Boolean = true
  val aChar : Char = 'a'
  val aInt : Int = 10
  val aShort : Short = 3422
  val aLong: Long = 34234234234L
  val aFloat: Float = 12.3f
  val aDouble: Double = 34.4

  // variables
  var aVariable: Int = 12
  aVariable = 5   // side effects (we call side effects in functional prog )    mutable
  var newV = 12;
  println(newV);

  // functional prog mostly use val











}
