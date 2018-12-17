package com.alex.demo1.demo3

object TestCat {


  def main(args: Array[String]): Unit = {
     val cat :Animal= new Cat()



    val unit: Unit = cat.eat()

    cat.sleep()


  }

}
