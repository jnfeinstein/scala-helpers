package joelf.helpers

import org.scalatest.FunSuite
import org.scalatest.Matchers

class PairedCollectionsTest extends FunSuite with Matchers {
  import PairedCollections._

  test("should keyBy") {
    val s = Seq(6, 8, 10).keyBy(_ / 2)
    s should contain (3 -> 6)
    s should contain (4 -> 8)
    s should contain (5 -> 10)
  }

  test("should reduceByKey") {
    val m = Seq("x" -> 5, "x" -> 6, "y" -> 10).reduceByKey(_ + _)
    m should contain key ("x")
    m.get("x") should be === Some(11)
    m should contain key ("y")
    m.get("y") should be === Some(10)
  }
}
