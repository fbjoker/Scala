package com.alex.demo1.demo3

class Emp {



  var name:String=_
  var age:Int=_


  def say(): Unit ={
    println("hello")

  }

  def say(str:String*) = {

    str.mkString("\n")
  }

}
