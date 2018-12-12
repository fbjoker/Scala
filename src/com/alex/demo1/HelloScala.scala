package com.alex.demo1

/**
  * 第一个Scala
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello scala!!!")

    var age= 44
    if (age>50){
      println("ok")

    }else{
      if (age<30){
        println("中")
      }else{
        println("壮")
      }
    }

    println("==========================")

    var s=82
    if(s>=0&&s<=60){
      println("c")
    }else if (s>=61&&s<80){
      println("b")
    }else if (s>=81&&s<=100){
      println("a")
    }

    println("==========================")
    var rr=82
   var res= if(rr>=0&&rr<=60){
      println("c")
      rr+22
    }else {
      println("b")
      rr-55

    }

    println(res)












  }
}
