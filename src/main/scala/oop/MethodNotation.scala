package com.playground
package oop

import scala.language.postfixOps

object MethodNotation extends App {

  class Person(val name: String) {

    def likes(str : String) : String = s"$name likes $str"
    def meets(person: Person) : String = s"${this.name} meets ${person.name}"

    def unary_! : String = s"${this.name} is not good"

    def isHonest : String  = s"${this.name} is honest"

    def apply() : String = s"${this.name} is calling apply"

    def +(name: String) : Person = {
      var newName = s"${this.name} ( ${name} )"
      new Person(newName)
    }

    def learns(thing : String) : String = s"${name} learns ${thing}"
    def learnsScala : String = this learns "scala"       // calling the above method

  }

  val person = new Person("Poo")
  println(person.likes("pizza"))
  println(person likes "pizza")    // syntectic suger    infix notation    method must have single parameter

  val person2 = new Person("Jen")
  println(person.meets(person2))
  println(person meets person2)

  val x = -1
  val y = 1.unary_~
  println(y)

  println(person2.unary_!)
  println(!person2)       // prefix notation

  println(person.isHonest)
  println(person2 isHonest)  // postfix notation

  println(person())        // apply

 val person3 = person + "The rock starr"
 println(person3.name)

 println(person learns "java")

 println(person learnsScala)






}
