package com.alex.demo1.demo5

class Test9(var name:String, var age:Int) {



}



object Test9{

  def apply(name: String, age: Int): Test9 = new Test9(name, age)

  def unapply(arg: Test9): Option[(String, Int)] = {
    if (arg==null){
      return  None
    }else {
      return  Some(arg.name,arg.age )
    }

  }
  
}



object Test9OB{
  def main(args: Array[String]): Unit = {

    val t=Test9

    println(t)
  }
}






