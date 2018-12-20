package com.alex.demo1.demo5

class Test8 {

  private val name:String="001"


  def show()={
    println("Luck001!")
  }

}


import com.alex.demo1.RichFish._
object Test8{

  def main(args: Array[String]): Unit = {

    val test = new Test8

    println(test.name)

    val fish = new Fish

    fish.swimming

    fish.add(3,5)
  }

}


class  Fish{




}



  class skill{
    def swimming: Unit ={
      println("我是一条鱼")
    }


    def add(a:Int,b:Int): Unit ={

      a+b
    }
  }





