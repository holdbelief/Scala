package source

import scala.io.Source

object SourceDemo2 {
  def main(args: Array[String]): Unit = {
    
  }
  
  val lines = Source.fromFile("/home/holdbelief/temp/无标题文档 1").getLines().toList
  def widthOfLength(s:String) = s.length().toString().length()
  
  var maxWidth = 0
  for ( line <- lines ) {
    maxWidth = maxWidth.max(widthOfLength(line))
  }
  
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length() > b.length()) a else b
  )
  
  val maxWidth2 = widthOfLength(longestLine)
  
  for ( line <- lines ) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length() + "|" + line)
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}