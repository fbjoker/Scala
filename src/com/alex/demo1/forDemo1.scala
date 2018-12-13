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



    var signum=(a:Double)=>{if(a>0){1}else{ if(a<0){-1}else{ 0}}}

    def fune(x:Long,n:Long):Long={
      if(n==0) 1
      else
      {
        if(n>0)x*fune(x,(n-1))
        else 1/fune(x,-1*n)
      }
    }





  }


}
