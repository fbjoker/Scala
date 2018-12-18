package com.alex.demo1.demo5

object TestImplicit {

  implicit  class equmentInt(x:Int){

    def add(a:Int,b:Int): Int ={
      a+b
    }


  }

  def main(args: Array[String]): Unit = {
      val i = 1.add(3,4)
    println(i)


  }

}




class  addInt(x:Int){

  def  add2(a:Int,b:Int): Int ={
    a+b+x
  }

  def add3(a:Int,b:Int):Int={
    a+b
  }



}


class  StrSplit(x:String){

  def  kgsplit() ={
    x.split(" ")
  }





}


object  PreDef{

  implicit  def addint(x:Int)=new addInt(x)
  implicit  def kgstr(x:String)= new StrSplit(x)



}


object  TestImp{
   implicit def add(x:Int)=new addInt(x)


  def main(args: Array[String]): Unit = {

    val x = 1.add2(3,1)

    print(x)

  }
}


