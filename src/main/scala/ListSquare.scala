class ListSquare {
  def squareList(list: List[Int]): List[Int] = {
    list match {
    // If list is empty it return empty
      case Nil => Nil
      // If list is not empty then it square
      case head :: tail => (head * head) :: squareList(tail)
    }
  }

}
