package com.faceye.mars.booking
import scala.io.Source


object IO {

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines()) {
        println("Line:" + line)
      }
      //函数式风格
      val lines = Source.fromFile(args(0)).getLines().toList
      var width = args(0).toInt
      //      for (arg <- args.drop(0)) {
      //        processFile(arg, width)
      //      }
    }
    //函数示例
    increase
  }

  /**
   * 函数与闭包学习
   */
  def processFile(fileName: String, width: Int) {
    for (line <- Source.fromFile(fileName).getLines()) {
      processFile(fileName, width, line)
    }
  }
  private def processFile(fileName: String, width: Int, line: String) {
    if (line.length() > width) {
      println("processFile is:" + fileName + ",Line is:" + line)
    }
  }
  def increase {
    var increase = (x: Int) => x + 1
    increase = (x: Int) => {
      println("I am a increase fun")
      x + 1
    }
    println("increase is:" + increase(10))
    //使用函数作参数
    var list = List(9, 1, 2, 3, 45)
    list.foreach { (x: Int) => println(x) }
    //目标类型化，不需要显示指定x的类型
    list.foreach { x => println(x) }
    //使用占位符最简短的形式
    list.foreach { println _ }
    //过滤器 
    println(list.filter { x => x > 10 })
    //占位符号语法
    println(list.filter { _ > 9 })

    //使用闭包
    val increaseMore = makeIncrease(199)
    increaseMore(1)
    println(increaseMore(1))
    
    //可变参数
    var arr=Array[String]("1","2","3")
    echo(arr: _*)
    
    //调用高阶函数
    val numbers=List[Int](1,2,3,0)
    val isContainsZero=numbers.exists { _==0 }
    println(isContainsZero)
  }
  /**
   * 闭包
   */
  def makeIncrease(more: Int) = (x: Int) => x + more
  
 /**
  * 可变参数 
  */
  def echo(msg:String*)=msg.foreach { s => println(s) }
  
  
}