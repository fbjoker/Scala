package com.alex.demo1.demo3

object TestEmp {


  def main(args: Array[String]): Unit = {

    val emp = new Emp()

    emp.age=18
    emp.name="alex"

    emp.say()

    val str = emp.say("wooooooooooo","waaaaaaa")

    println(str)

    def add(a:Int)=(b:Int)=>{a+b}


    val list= List("kaka","shalu","bejt")

    val str2 = emp.say(list:_*)



    print(str2)
    println(add(-5))
    println(add(-5)(12))
    println("====================")


    val emp2:Emp2 = new Emp2("alex",18)


    println(emp2.age+"\t"+emp2.name)


    val alex = new emp3("alex")
    val alex2 = new emp3(18)
    val alex3 = new emp3("alex",18)










  }

}
