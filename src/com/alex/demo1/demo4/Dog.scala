package com.alex.demo1.demo4

class Dog extends Pet {
  override var name: String = "laifu"


}


class Pig extends  Pet{
  override var name: String = "pig"
}


object  TestPet{
  def main(args: Array[String]): Unit = {

    val pig = new Pig
    val dog = new Dog

    print(pig.name)
    print(dog.name)
    println("============================")

     val ant = new Ant

    print(ant.range)
    print(ant.env.toBuffer)


  }
}


class Creature(){
  val range:Int=10

  val env:Array[Int]=new Array[Int](range)
}

class Ant extends  Creature{
  override val range: Int = 2
}