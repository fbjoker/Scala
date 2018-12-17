package com.alex.demo1.demo2

import scala.beans.BeanProperty

class Emp {

  @BeanProperty var name:String=_
  var age:Int=_


  def skill(){
    println(name)

  }


}
