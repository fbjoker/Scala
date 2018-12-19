package com.alex.demo1.demo6


class Person(var name:String,var age:Int) {}

object Person{

  def apply(name: String, age: Int): Person = {  return new Person(name, age)
  }
}



object Testt3{
  def main(args: Array[String]): Unit = {


    val per=new Person("zz",18)
    println(per.name)

    val per2=Person("AA",33)
    print(per2.age)

    val list= (1 to 100).toList

    print(list)

  }
}

// 默认都是val, 除非显示的指定var
//重写了tostring, hashcode ,equls 等方法
//实现了序列化接口
//匹配模式中不需要new

//
