package com.alex.demo1.demo4

object TestTrait {

  def main(args: Array[String]): Unit = {

     val fire = new fire()

    fire.done



  }

}


trait  XHS{

  def getXhs()={

    println("西红柿....")
  }


}

trait  JD{
  def getJd()={

    println("鸡蛋蛋....")
  }


}


trait Tiaoliao{

  def getTiaoliao()={
    println("调料...")
  }

  def getJd()={

    println("调料鸡蛋....")
  }
}

class  fire extends  XHS with Tiaoliao  with   JD {


  override def getJd(): Unit = {
    println("重写的鸡蛋...")

  }

  def done={

    getXhs()
    getJd()
    getTiaoliao()

    println("打完收工")

  }


}




