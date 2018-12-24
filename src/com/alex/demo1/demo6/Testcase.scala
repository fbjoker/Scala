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
  def ttt(c:Int): Unit ={

    c match {
      case 1 =>{println("1")}
      case 2 =>{println("2")}
      case 3 =>{println("3")}
      case _ =>{print("不对")
      }

    }



  }

  def sit(a:String)={

    val A="AAAA"
    val B="BBBB"

    a match {
      case A =>{println("isA")}
      case B  =>{println("isB")}
      case _ =>{println("other")}

    }
  }

  def casematch(a:Animal): Unit ={
    a match {
      case  dog:Dog =>{ println("dog")}
      case  cat: Cat =>{ println("cat")}
      case  _ =>{ println("other")}


    }

  }


  def casemathc2(a:Animal)={
    a match {
      case Dog(name:String) =>{println("dog")}
      case Cat(name:String) =>{println("cat")}
      case _ =>{println("other")}




    }

  }


  def collectionmath(a:Any)={

    a match {

      case Array(x)=>{println("x")}
      case Array(x,y)=>{println("x,y")}
      case List(x)=>{println("L:x")}
      case List(x,y)=>{println("L:x,y")}
      case (x,y)=>{println("t:x,y")}
      case (0,y)=>{println("t:0,y")}

    }

  }

  def optmatch(a:Any)={

    a match {

      case  Some(x)=>{println(x)}
      case  None=>{println("null")}
    }
  }


  def ff:PartialFunction[String,Unit]={
    case "ok"=>{println("ok")}
    case "no"=>{println("no")}
  }


}

class Animal{

}

case  class  Cat(name:String) extends Animal{

}

case  class  Dog(name: String) extends  Animal{

}




object  Testcaseob{
  def main(args: Array[String]): Unit = {

    val cat = new Cat("tom")
    val mango = new Dog("mango")


    val t = new Testcase

//
//    testcase.content("1")
//
//    testcase.calc(4,5,"*")
//    testcase.calc(4,5,"p")
//    println("输入a:")
//    val a = Console.readInt()
//    println("输入b:")
//    val b = Console.readInt()
//    println("输入运算符+-*/:")
//    val c = Console.readChar().toString
//
//    testcase.calc(a,b,c)
    t.sit("BBBB")

    t.casematch(cat)
    t.casematch(mango)


    val unit: Unit = t.casemathc2(cat)

    t.collectionmath(Array(0,2))
    t.collectionmath(List(0,2))


    val map = Map("id"->1001)

    t.optmatch(map.get("id1"))

    t.ff("ok")

    t.ttt(1)



  }
}
