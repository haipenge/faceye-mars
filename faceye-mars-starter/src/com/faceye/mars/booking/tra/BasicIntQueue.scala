package com.faceye.mars.booking.tra

import scala.collection.mutable.ArrayBuffer
class BasicIntQueue extends IntQueue {
  val buf = new ArrayBuffer[Int]
  def put(x: Int) = { buf += x }
  def get() = { if (buf.length > 0) buf.remove(0) else 0 }

}