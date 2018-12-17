package com.alex.demo1.demo4

class Time (val hrs:Int,val min :Int){




    val minutes=min
    val hours=hrs


  def before(other:Time) :Boolean={

    if (other.hours-hours>=0&&other.minutes>minutes){
      return true

    }else{
      return  false
    }

  }



}


object  TestTime{

  def main(args: Array[String]): Unit = {

    val time = new Time(10,22)
    val time2= new Time(10,23)

    val bool = time.before(time2)

    println(bool)
  }

}
