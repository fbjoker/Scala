package com.alex.demo1.demo2

import scala.beans.BeanProperty

class Person {

  @BeanProperty var name:String=""
  @BeanProperty  var age:Int=0



  def resume():Unit={

    println("hello!")
  }
  def print(): Unit ={
     println(name)
  }


}
