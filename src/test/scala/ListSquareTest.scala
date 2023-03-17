import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ListSquareTest extends AnyFlatSpec {
val list = new ListSquare()
"test1" should "list squares" in{
  list.squareList(List(1,2,3,4,5,6)) shouldEqual List(1,4,9,16,25,36)
}
  "test2" should "list squares" in{
    list.squareList(List(10,20,30)) shouldEqual List(100,400,900)
  }
}
