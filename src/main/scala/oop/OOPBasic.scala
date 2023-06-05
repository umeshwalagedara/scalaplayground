package com.playground
package oop

object OOPBasic extends App {

  val person = new Person("umesh", 39)
  println(person.age)
  println(person.x)
  println(person.greet("poo"))
  println(person.greet())

  val person2 = new Person
  println(person2.age)

}

class Person (name : String, val age: Int) {

  val x = 4;
  println(5 + 5)

  // usage of this to access class level para/fields
  def greet(name: String) : Unit = println(s"${this.name} says, Hello $name")

  // method overloading
  def greet(): Unit = println(s"hi $name")

  // constructor overloading.  multiple constructors
  // have to call the other constructor
  def this() = this("test", 123)

}
