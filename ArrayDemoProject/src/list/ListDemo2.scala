package list

import scala.collection.mutable.Set

object ListDemo2 {
  def main(args: Array[String]): Unit = {
    
  }
  
  val oneTwo = List(1,2)
  val threeFour = List(3,4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo.getClass)
  println(threeFour.getClass)
  println(oneTwoThreeFour.getClass)
  println(oneTwo == oneTwoThreeFour)
  
  val a = List(1,2)
  val b = List(3,4)
  println(a==b)
  println(a.eq(b))
  
  
  val c = threeFour ::: oneTwo
  println(c)
  
  val d = a :: b
  println(d)
  
  
  val e = a ::: b
  
  println("e = " + e)
  
  val oneTwoThree = 1 :: 2 :: 3 ::Nil
    
  println("oneTwoThree = " + oneTwoThree)
    
    
  val set1 = Set("a","b","c")
    
  println(set1.getClass.getName)  
  
  val set2 = Set("a","b","c")
  val set2_1 = set2 + "d"
  println("set2.getClass() : " + set2.getClass)
  println("set2_1.getClass() : " + set2_1.getClass)
  println("set2.hashCode() : " + set2.hashCode())
  println("set2_1.hashCode() : " + set2_1.hashCode())
  println("set2.eq(set2_1) : " + set2.eq(set2_1))
  println("set2 == set2_1 : " + set2 == set2_1)  
    
    
    
    
    
  
  
}