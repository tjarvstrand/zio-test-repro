import zio.Scope
import zio.test.Gen.alphaNumericString
import zio.test._

object MainSpec extends ZIOSpecDefault {

  override def spec: Spec[Scope, Any] =
    suite("suite2")(Seq(
      test("test") {
        check(alphaNumericString)(str => assertTrue(str == str))
      },
      test("test2") {
        check(alphaNumericString)(str => assertTrue(str == str))
      }
    ))

}
