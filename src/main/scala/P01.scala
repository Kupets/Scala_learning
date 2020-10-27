class P01 {


  def last(list: List[Int]): Int = {
    list.last
  }

  //use init
  def penultimate(list: List[Int]): Int = {
    list(list.length - 2)
  }

  def nth(i: Int, list: List[Int]): Int = {
    list(i)
  }

  def length(list: List[Int]): Int = {
    list.length
  }

  def reverse(list: List[Int]): List[Int] = {
    list.reverse
  }

  // use splitAt
  def isPalindrome(list: List[Int]): Boolean = {
    var res = false
    var center = list.length / 2
    while (center >= 0) {
      if (list(center) == list.reverse(center)) res = true else res = false
      center = center - 1
    }
    res
  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case subList: List[Any] => flatten(subList)
    case element => List(element)
  }

  //? use fold
  def compress(list: List[Any]): List[Any] = {
    list match {
      case el :: tail => el :: compress(list.dropWhile(_ == el))
      case Nil => Nil
    }
  }



}
