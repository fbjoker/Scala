package com.alex.demo1.demo3

class emp3 private() {

  var name:String=_
  var age:Int=_


  def this (name:String){

    this()
    this.name=name
  }
  def this (age:Int){

    this()
    this.age=age
  }
  def this (name:String,age:Int){

    this()
    this.name=name
    this.age=age
  }


  override def toString = s"emp3($name, $age)"
}
