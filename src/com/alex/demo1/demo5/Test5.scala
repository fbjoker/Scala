package com.alex.demo1.demo5

class Test5 {


  def printstr( implicit str:String)={

    print(str)

  }

}

object  testob5{

  def main(args: Array[String]): Unit = {

    val test = new Test5
    implicit var a:String="im! "


    print(test.printstr)
  }
}
