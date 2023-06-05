package com.playground
package oop

object AbstractTest extends App {

  abstract class Animal {
    def eat : Unit
  }

  trait shoutable {
    def shout: Unit
  }

  class Cat extends Animal with shoutable {
     def eat = println(" cat eating")

    def shout: Unit = println(" cat meaw....")
  }

  val cat = new Cat
  println(cat.eat)
  println(cat.shout)

}
