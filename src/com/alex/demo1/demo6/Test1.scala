package com.alex.demo1.demo6

object Test1 {

  implicit class MyRichString(x:String){

    def toLower(str:String):String={

      str.toLowerCase()

    }

  }

  def main(args: Array[String]): Unit = {


      val str = "a".toLower("aaBBcc")
    println(str)


  }



}



object MyRichString{
  implicit def richstring(x:String) =new testLower()
}


class  testLower{

  def toLower(str:String):String={

    str.toLowerCase

  }

}



object testrich2{
  def main(args: Array[String]): Unit = {
    implicit def richstring(x:String) =new testLower()
    val str1 = "a".toLower("abB")
    println(str1)
  }
}

import com.alex.demo1.demo6.MyRichString._
object testRich{

  def main(args: Array[String]): Unit = {
     val str = "a".toLower("aaBB")
    println(str)
  }

}
