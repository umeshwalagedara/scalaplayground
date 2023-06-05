package com.playground
package oop

object OOPTest extends App {

  val writer = new Writer("umesh", "anuradha", 39)
  val novel = new Novel("tintin", 2010, writer)
  println(writer.getFullName())
  println(novel.getAutherAge())
  println(novel.isWrittenBy("umesh anuradha"))

  val newNovel = novel.copy()
  println(newNovel.yearOfRel)


}

class Writer(val firstName: String, val surName: String, val  age: Int) {

  def getFullName(): String = {
    firstName + " " + surName
  }

}

class Novel(name :String,val  yearOfRel: Int, author: Writer){

  def getAutherAge() : Int = {
    val now = 2023
    var booksAge = now - yearOfRel
    return  author.age - booksAge
  }

  def isWrittenBy(name: String): Boolean = {
    if(name.equals(author.getFullName()))
      true
    else
      false
  }

  def copy(): Novel = {
    new Novel(this.name,  this.yearOfRel + 1, this.author)
  }


}
