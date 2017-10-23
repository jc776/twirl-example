package example

case class Item(name: String)

object Main {
  def main(args: Array[String]): Unit = {
    val items = (1 to 10).map(x => Item(s"Item ${x}"))
	
	val output = example.html.hello(items)
	
	println(output)
  }
}