package com.alex.demo1.demo6

class Testcase {

  def content(a:Any)={

    a match{
      case "1" =>{ print(a)}
      case "2" =>{ print(a)}
      case "3" =>{ print(a)}
      case _ =>{print("all")}

    }

  }

  def calc(a:Double,b:Double,c:String): Unit ={

    c match {
      case "+"=>{print("+==>"+a+b)}
      case "-"=>{print("-==>"+(a-b))}
      case "*"=>{print("*==>"+a*b)}
      case "/"=>{print("/==>"+a/b)}
      case _ =>{print("不对")}

    }



  }


}


object  Testcaseob{
  def main(args: Array[String]): Unit = {

    val testcase = new Testcase


    testcase.content("1")

    testcase.calc(4,5,"*")
    testcase.calc(4,5,"p")
    println("输入a:")
    val a = Console.readInt()
    println("输入b:")
    val b = Console.readInt()
    println("输入运算符+-*/:")
    val c = Console.readChar().toString

    testcase.calc(a,b,c)


  }
}
