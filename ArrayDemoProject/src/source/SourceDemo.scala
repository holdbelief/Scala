package source

import scala.io.Source

object SourceDemo {
  def main(args: Array[String]): Unit = {
    
  }
  
  for ( line <- Source.fromFile("/home/holdbelief/temp/无标题文档 1").getLines ) {
    println(line.length() + " " + line)
  }
}