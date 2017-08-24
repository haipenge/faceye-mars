package com.faceye.mars.booking

object LearnRecord {
  def main(args: Array[String]): Unit = {
    val msg = "这里记录学习scala的每一个阶段";
    println(msg)
    args.foreach(arg => println)
    //与下一行等同
    args.foreach(println)
    //与下行等同
    for (arg <- args) {
      println(arg)
    }
    useArray()
    useList()
    useTuple()
    useSet
    useMap
  }
  /**
   * 数组的使用
   */
  def useArray() {
    println("数组的使用")
    val arr = new Array[String](3)
    arr(0) = "1"
    arr(1) = "2"
    arr(2) = "3"
    for (i <- 0 to 2) {
      println("第 " + i + " 个元素:" + arr(i))
    }
    println("数组的长度是:" + arr.length)
  }

  /**
   * 使用List
   */
  def useList() {
    val list = List(1, 2, 3)
    var list2 = List(4, 5)
    //将两个list合并
    val list3 = list ::: list2
    println("List is:" + list + ",list1 is:" + list2 + ",list3 is:" + list3)
    //向list 头部追加一个元素
    val aList = 0 :: list
    println("追加元素后的aList:" + aList + ",原list:" + list)
    aList.foreach { s => println(s) }
    var mList = aList.map { i => i * 2 }
    println("after map list:" + mList)
    println("is alist exist 0:" + aList.exists { x => x == 0 })
  }

  /**
   * 使用元组
   */
  def useTuple() {
    var tup = (1, 2, 3)
    println(tup._1 + ":" + tup._2 + ":" + tup._3)
  }

  /**
   * 使用集合
   */
  def useSet() {
    //可变集合
    var set = Set("beijing", "shenzhen")
    set += "guangzhou"
    println(set)
    //不可变集合
    var unChangeSet = scala.collection.mutable.Set("xx", "yy")
    unChangeSet += "xre"
    println(unChangeSet)
  }
  def useMap {
    //默认使用不可变类型
    val map = Map(1 -> "one", 2 -> "tow", 3 -> "three")
    println(map)
    //使用可变类型
    val rmap = scala.collection.mutable.Map[Int,String]()
    rmap += (1 -> "one")
    rmap += (2 -> "two")
    println(rmap)
  }
  /**
   * 函数式编程
   */
  def formatArgs(args:Array[String])=args.mkString(",")

}