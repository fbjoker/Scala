package com.alex.demo1.demo6

import java.io.PrintWriter

import scala.collection.mutable
import scala.collection.mutable._
import scala.io.{BufferedSource, Source}

class TestFile {

}


object TestFile{


  def main(args: Array[String]): Unit = {
//    val source: BufferedSource = Source.fromFile("D:\\HadoopCluster\\Hadoopdata\\video\\3.txt")
//
//    val lin: Iterator[String] = source.getLines()
//
//    println(lin)
//    lin.foreach(println(_))

//    val data: Array[String] = source.mkString.split("\\s+")
//    println(data.toBuffer)
//    val out: Map[String, Int] = data.map((_,1)).groupBy(_._1).mapValues(_.size)
//
////    println(out)
//
//     val writer = new PrintWriter("D:\\out.txt")
//
//
//    out.map(x=>writer.write((""+x._1+"\t"+x._2+"\n")))

    val map = new scala.collection.mutable.HashMap[String,Int]()

    map++=Map("id"->1001,"name"->2222)
    map++=Map("galax"->444)
    map++=Map("galax"->444)
    val array: Array[(String, Int)] = map.toArray
    val ttt: HashMap[String, Int] = map.map(x=>(x._1,x._2))
    val a = Map("e" -> 1, "a" -> 1, "b" -> 1, "c" -> 2, "d" -> 1).toArray
    val tt: mutable.Map[String, ArrayBuffer[(String, Int)]] = Map("a" -> ArrayBuffer(("e",1), ("e",1)))

    //tt.mapValues(x=>x.reduce((a,b)=>{a._2+b._2}))

    val i= Array(("e",1), ("e",1)).reduceLeft((a, b)=>{(a._1,a._2+b._2)})
    val tte= Array(("e",1), ("e",1))
    var count=0
    for (x<-tte){
      count += x._2

    }



    println(map)
    println(array.toBuffer)
    println(a.toBuffer)
    println(count)



  }
}
