package com.faceye.mars.booking.tra

/**
 * 在类中混入特质(多个,Book,OBook)
 */
class EBook extends Book with OBook{
 override def toString ="green" 
}