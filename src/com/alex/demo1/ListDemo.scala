package com.alex.demo1

object ListDemo {

  def main(args: Array[String]): Unit = {


    var n=22


    var arr=for (x<- 0 until n) yield   math.random*n
    arr.toArray

    println(arr)
    println(arr)
    val list=List("hello world", "hello java"," hello scala")


    list.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.size)


  }

}
