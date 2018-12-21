package com.alex.demo1.demo7

import java.io.PrintWriter

import scala.io.{BufferedSource, Source}

class FileDemo1 {



}


object  FileDemo1{
  def main(args: Array[String]): Unit = {

    val source: BufferedSource = Source.fromFile("D:\\HadoopCluster\\Hadoopdata\\ctproj\\callmini.log")
    //val source: BufferedSource = Source.fromFile("D:\\HadoopCluster\\Hadoopdata\\video\\3.txt")
    val a: Iterator[String] = source.getLines()
    //a.foreach(println(_))


    val arr: Array[String] = source.mkString.split("\\s+")

    val out: Map[String, Int] = arr.map((_,1)).groupBy(_._1).mapValues(_.size)
   // val out = arr.map((_,1)).groupBy(_._1)
   // out.foreach(println(_))




    val writer: PrintWriter = new PrintWriter("d:\\ttt")

    out.map(x=>writer.write((""+x._1+"\t"+x._2+"\n")))

  }
}
