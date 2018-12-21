package com.alex.demo1.demo7



class MatchTest {


  def matchdemo1(x:Any)={

    x match {
      case  "x"=>{print(x)}
      case  _ =>{print("other")}

    }

  }



  def matchdemo2(x:Any)={


    x match {

      case x:Int =>{println("int")}
      case x:Double =>{println("double")}
      case x:String =>{println("str")}
      case x:Map[String,String] =>{println("map")}
      case List(_) =>{println("list")}
      case x:Map[_,_] =>{println("map2")}
      case x:Array[_] =>{println("array")}
      case  _ =>{println("other")}
    }
  }



}


object  MatchTest{
  def main(args: Array[String]): Unit = {
    val test = new MatchTest
    test.matchdemo2(3)
    test.matchdemo2(2.0)
    test.matchdemo2("alex")
    test.matchdemo2(Map("id"->"1001"))
    test.matchdemo2(List(1))
    test.matchdemo2(Array(1,23))


  }
}
