package com.alex.demo1.demo2

object TestDog {

  def main(args: Array[String]): Unit = {

    val dog = new Dog()

    dog.color="red"
    dog.name="lafu"

    dog.eat()

    println(dog.color+"\t"+dog.name)


    val str = dog.wowo()
    println(str)

    dog.bbb("001","17号")

    println(dog.add(1,2,3))
    def add1(a:Int)=(b:Int)=>{  a+b   }

    val aaa=add1(1)
    aaa(3)

//方法转函数
 val f1=add1 _
    f1(3)(4)

  }

}
