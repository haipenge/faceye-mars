package com.faceye.mars.booking

/**
 * 抽像类
 */
abstract class Ele {
  /**
   * 抽像方法 
   */
  def contents:Array[String]
  
  /**
   * 无参数方法 
   */
  def height:Int=contents.length
  
  /**
   * 无参数方法 
   */
  def width:Int = if(height==0) 0 else contents.length
  
  /**
   * 将无参数方法 改为属性实现
   */
  val height2=contents.length
  val width2=if(height2==0) 0 else contents.length
  
  def demo(){}
  
  def above(that:Ele):Ele= new ArrayEle(this.contents ++ that.contents)
  
  def beside(that:Ele):Ele={
    val contents=new Array[String](this.contents.length)
    val length=this.contents.length
    for(i <- 0 until this.contents.length){
      contents(i)=this.contents(i) + that.contents(i)
    }
    new ArrayEle(contents)
  }
  /*
   *  使用函数式改造beside
   */
  def beaiseAsFunction(that:Ele){
    new ArrayEle(for((line1,line2) <- this.contents zip that.contents)yield line1+line2)
  }
  override def toString = contents.mkString("\n")
}