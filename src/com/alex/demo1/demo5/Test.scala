package com.alex.demo1.demo5

object Test {

  implicit class MyRichInt(x:Int){

    def  add(a:Int,b:Int): Int ={
      return  a+b+x
    }

  }

  implicit  def toInt(x:Int)= new MyRichInt2(x)

  def main(args: Array[String]): Unit = {
    val i = 1.add3(2,3)
    println(i)


  }


}


 class MyRichInt2(var i:Int){


   def  add3(a:Int,b:Int): Int ={
     return  a+b+i
   }
  def  add2(a:Int,b:Int): Int ={
    return  a+b
  }

}
