package com.alex.demo1.demo6

import java.io.PrintWriter

import scala.io.{BufferedSource, Source}

class TestFile {

}


object TestFile{


  def main(args: Array[String]): Unit = {
    val source: BufferedSource = Source.fromFile("D:\\HadoopCluster\\Hadoopdata\\video\\3.txt")

    val lin: Iterator[String] = source.getLines()
//    lin.foreach(println(_))

    val data: Array[String] = source.mkString.split("\\s+")
    println(data.toBuffer)
    val out: Map[String, Int] = data.map((_,1)).groupBy(_._1).mapValues(_.size)

//    println(out)

     val writer = new PrintWriter("D:\\out.txt")


    out.map(x=>writer.write((""+x._1+"\t"+x._2+"\n")))


  }
}
