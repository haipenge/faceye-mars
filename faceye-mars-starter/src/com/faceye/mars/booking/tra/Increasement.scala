package com.faceye.mars.booking.tra

trait Increasement extends IntQueue{
  abstract override def put(x:Int)={super.put(x+1)}
}