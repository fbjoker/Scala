package com.alex.demo1

object ListDemo {

  def main(args: Array[String]): Unit = {


    var n=22


    var arr=for (x<- 0 until n) yield   math.random*n
    arr.toArray

    println(arr)
    println(arr)

  }

}
