package com.faceye.mars.booking.tra

trait Doubling extends IntQueue {
  abstract override def put(x:Int)={super.put(x*2)}
}