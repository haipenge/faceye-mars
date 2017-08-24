package com.faceye.mars.booking


class ArrayEle(cons:Array[String]) extends Ele {
  
  /**
   * 实现抽像方法
   */
  def contents:Array[String]=cons
  
  /**
   * 使用属性覆盖无参数方法
   */
  //val contents:Array[String]=cons
  /**
   * 定义方法 为final,将不会被 子类重写
   */
  final override def demo(){
    
  }
  
  def main(args: Array[String]): Unit = {
    val el:Ele=new ArrayEle(Array("hello","world"))
  }
}


//参数化字段方式，解决方法名与属性名不能重复问题
class ArrayEle0(val contens:Array[String]) extends Ele{
  /**
   * 使用属性覆盖无参数方法
   */
  val contents:Array[String]=contents
}

class LineEle(val str:String) extends ArrayEle(Array(str)){
  
}

/**
*多态与动态绑定
*/

class UEle(ch:Char,override val width:Int,override val height:Int)extends Ele{
  private val line=ch.toString()*width
  def contents = Array(line)
}