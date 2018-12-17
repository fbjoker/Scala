package com.alex.demo1.demo3

object TestStudent {

  def main(args: Array[String]): Unit = {

     val student = new Student()

    student.name="alex"
    student.age=10

    student.sayhello()

    val s1:Person= new Student()

   // val bool = s1.isInstanceOf[Student]
val s2 = s1.asInstanceOf[Student]
    s2.daydayup()


    val teacher:Person = new teacher()
    val teacher1 = teacher.asInstanceOf[teacher]

    teacher1.teach()
    println(classOf[teacher])
    println(classOf[Student])

  }

}
