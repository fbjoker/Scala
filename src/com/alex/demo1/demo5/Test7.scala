package com.alex.demo1.demo5

class Test7 {

}



object  Test7  extends  App {

  println("-------------->apptest")

   val i: Int= Calc.add(4,5)

  println(i)

}

object  Calc{

  val name:String="sd"

  def add(a:Int,b:Int)={

    a+b
  }

}
