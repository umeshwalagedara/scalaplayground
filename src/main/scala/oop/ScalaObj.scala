package com.playground
package oop

object ScalaObj extends App {

  class Person(val name: String){
    def greet() : String = s"welcome $name"
    def info(): String = s"$name has ${Person.n_eyes} eyes"
  }

  object Person{
    val n_eyes = 2
    def apply(age: Int): Person = new Person("Umesh")
  }


  val p1 = new Person("umesh")
  println(p1.name)
  println(p1.greet())
  println(p1.info())

  val personTest = Person(2)
  println(personTest.name)
  
}
