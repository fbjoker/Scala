package com.alex.demo1.demo5

class TestDay4 {


  def  fun1()={
    print("无参数")
  }


  def speak(content:String)={
    println(content)

  }


  def  speak(content:String,name:String)={
    print(content+"\t"+name)
  }


  def add(a:Int=10,b:Int=20)={
    a+b
  }
  def sum(n :Int*)={
    val sum=n.sum
    print(sum)
  }

  def add1(a:Int,b:Int)={
    a+b
  }

  val add2=add1 _


}


object Day4{
  def main(args: Array[String]): Unit = {
    val day4 = new TestDay4()
    val res=day4.add2(1,2)
    println(res)


    println("===========================")
     val doctor = new FaceDoctor()
    doctor.speak()

    /* 1
       定义不同  def   val
       函数是对象, 方法不是,
       方法是面向对象的编程概念
       函数是函数式编程的"头等公民"
       函数作为参数可以传递,方法不能
       方法可以转换为函数


       2 先执行超类的构造器
         然后执行特质的构造器,在超类之后,类构造器之前
         按照混入的顺序由左向右执行
         特质有父类的先执行父类的,
         多个特质共有一个父类的,如果父类已经被构造,那么只执行一次
         特质执行完毕后才执行子类的

       */
  }
}



abstract class Doctor{
  var name:String

  def speak()
}

class FaceDoctor extends  Doctor{
  override var name: String = "zhangsan"

  override def speak(): Unit = {
    print(name)
  }
}
