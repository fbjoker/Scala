package com.alex.demo1.demo6

class test2 {

  def speak(implicit  str:String)={

    print(str)
  }

}


object  testspeak{

  def main(args: Array[String]): Unit = {

    implicit  var s:String="hello"


    val test = new test2()
    test.speak



  }
}
