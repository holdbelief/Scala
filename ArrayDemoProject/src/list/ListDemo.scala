package list

object ListDemo {
  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3, 4)
    val c = a.par.aggregate(5)(seqno, combine)
    println("c:" + c)

    val chars = Array('a', 'b', 'c')
    println("c:" + chars.charAt(0))
    println(chars.charAt(0).getClass())

    println(chars.apply(2))
    val newchars = chars.clone()
    println(chars.equals(newchars))

    newchars.map(println(_))

    val newchars2 = chars.collect(fun)
    println("newchars2:" + newchars2.mkString(","))

    val newchars3 = chars.map(fun)
    println("newchars3:" + newchars3.mkString(","))
    
    println(testfun3("你好"))
  }

  val fun: PartialFunction[Char, Char] = {
    case 'a' => 'A' case x => x
  }

  def seqno(m: Int, n: Int): Int = {
    val s = "seq_exp=%d+%d"
    println(s.format(m, n))
    return m + n
  }

  def combine(m: Int, n: Int): Int = {
    val s = "com_exp=%d+%d"
    println(s.format(m, n))
    return m + n
  }
  
  def max(a:Int, b:Int): Int = {
    if ( a > b ) a
    else b
  }
  
  def greet() = println("hello world")
  def greet2(): Unit = println("")
  
  val plusOne:Int=>Int={
    (num) => num + 1
  }
  
  val testfun = (x: Int) => x + 1
  val testfun2:(Int)=>Int = (x) => x +1
  val testfun3 = (x:String) => x + 1
  val testfun4 : (Int,String)=>Int = (x,y) => x + 1
  val testfun5 : (Int,String)=>Int = (x,y) => x + 1
  val someNumbers = List ( -11, -10, - 5, 0, 5, 10)
  someNumbers.foreach({x => {println(x)}})
  someNumbers.filter(x => x > 10)
  someNumbers.foreach(x => println(x))
  someNumbers.foreach((arg:Int) => println(arg))
  
  val strs:Array[String] = new Array[String](3)
  val numNames = Array("a",23);
  
  numNames.foreach(arg=>println(arg))
  
  
  
}











