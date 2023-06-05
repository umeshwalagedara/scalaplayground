package com.playground
package oop

object InheritanceTest extends App {

  sealed class Animal {
    val isMammal: Boolean = false
    def eat = println(" animal eats")
  }

  class Cat extends Animal{
    override val isMammal : Boolean = true
    override def eat = {
      super.eat
      println("cat is eating")
    }
  }

  class Dog(override val isMammal: Boolean) extends Animal{
    // we can add the override val in the constructor as well
  }


  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)

  }

  class Adult(name:String, age: Int, id: String) extends Person(name,age){   // using the main constructor

  }

  class Child(name: String, age: Int, id: String) extends Person(name) {    // using the other constructor

  }


  val cat = new Cat
  println(cat.eat)

}
