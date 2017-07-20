package function

object FunDemo {
  def main(args: Array[String]): Unit = {
     println(hof(list, fun5))
     println(hof(list, fun6))
  }

  val list:List[Int] = List(1,2,3,4,5,6);
  
  def hof(list: List[Int], f: (Int) => Int): List[Int] = {
    list match {
      case List() => Nil
      case head :: tail => f(head) :: hof(tail, f)
    }
  }
  
  def fun1(x: Int):Int = {
    x + 1
  }
  
  hof(list, fun1)
  
  val fun2:Int=>Int = x=>x+1
  
  hof(list, fun2)
  
  val fun3 = {
    x:Int=>x + 1
  }
  
  hof(list, fun3)
  
  val fun4: Int=>Int = {x:Int => 
    {
    	x+1
    }
  }
    
  hof(list, fun4)

  val fun5:Int=>Int = {x:Int => {
      x+1
    }
  }
  
  hof(list, fun5)
  
  val fun6 = {(x:Int) => 
      x+1
      x+2
  }
  
 val fun7 = (x:Int) => {
   x
 }
  
 val fac:(Int)=>Int = (n) => if(n <= 0) 1 else n*fac(n-1) 
  
  
  
  
  
  
  
  
  
}