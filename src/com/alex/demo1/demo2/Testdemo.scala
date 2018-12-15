package com.alex.demo1.demo2

object Testdemo {
  def main(args: Array[String]): Unit = {
    var p1= new Person();

    p1.age=10
    p1.name="alex"

    p1.resume()

    println(p1.name)
    println(p1.age)



  }

}
