package com.alex.demo1

object forDemo1 {

  def main(args: Array[String]): Unit = {


    var a =0
    while(a<5){
      println(Math.random()*10000)

      a+=1
    }


    do {
      println(a)
      a+=1

    }while(a<10)




  }


}
