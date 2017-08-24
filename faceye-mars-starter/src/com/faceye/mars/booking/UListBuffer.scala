package com.faceye.mars.booking

object UListBuffer {
  def main(args: Array[String]): Unit = {
    var examBuffer = new UseListBuffer()
    println(examBuffer.buildListBuffer())
    println(examBuffer.buildArrayBuffer())
  }
}