package com.alex.demo1.demo2

  class Dog {

    var color:String=_
    var name:String=_

    def eat(): Unit ={
      println("我爱吃鱼")
    }

    def run()={

    }


    def wowo(str:String="dccdcc") : String={

      println(str)

      return str

    }
    def bbb(str:String*) ={

      println(str)


    }
    def add(a:Int*) ={

      a.sum


    }


}
