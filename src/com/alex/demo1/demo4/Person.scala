package com.alex.demo1.demo4

class Person {
  var name:String=_

  private var age=20

  def hello()={
    println("hello")
  }


  def many(a:Int*): Int ={

    a.sum
  }

  val fa=many _


  override def toString = s"Person($name, $age)"
}



object TestPerson {
  def main(args: Array[String]): Unit = {
    val person = new Person


    person.name="axle"

    person.hello()


    val unit = person.many(1,2,3,4)
    val list= List(7,8,9)
    println(unit)
    println(person.many(list:_*))

    val fa = person.fa

    println(fa(list))
    println(person.toString)

  }




}
