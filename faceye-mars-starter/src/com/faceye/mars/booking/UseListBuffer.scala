package com.faceye.mars.booking

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

class UseListBuffer {
  def buildListBuffer():List[Int]={
    val buffer =new ListBuffer[Int]()
    buffer += 1
    buffer += 3
    2 +: buffer
    buffer.toList
  }
  
  def buildArrayBuffer():ArrayBuffer[Int]={
    val buffer=new ArrayBuffer[Int]()
    buffer +=1
    buffer += 2
  }
}