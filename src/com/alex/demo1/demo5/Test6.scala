package com.alex.demo1.demo5

class ComparaTools[T<:Comparable[T]](a:T,b:T) {


  def compara()={

    a.compareTo(b)


  }





}


class  Animal extends Comparable[Animal]{
  var age:Int=_
  override def compareTo(o: Animal): Int = {

    return age-o.age

  }
}


object ComparaToolsOB{
  def main(args: Array[String]): Unit = {

    val animal = new Animal
    val animal2 = new Animal

    animal.age=16
    animal2.age=12

     val cc = new ComparaTools[Animal](animal,animal2)

    val i = cc.compara()
    print(i)
  }
}
