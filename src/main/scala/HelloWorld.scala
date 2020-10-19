object HelloWorld {

  def main(args: Array[String]): Unit ={
    println("Hello World!")
    val p01 = new P01
    println(p01.last(List(1, 1, 2, 3, 5, 8)))
    println(p01.penultimate(List(1, 1, 2, 3, 5, 8)))
    println(p01.nth(2, List(1, 1, 2, 3, 5, 8)))
    println(p01.length( List(1, 1, 2, 3, 5, 8)))
    println(p01.reverse(List(1, 1, 2, 3, 5, 8)))
    println(p01.isPalindrome(List(1, 2, 3, 2, 1)))
   // println(p01.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
    println(p01.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
