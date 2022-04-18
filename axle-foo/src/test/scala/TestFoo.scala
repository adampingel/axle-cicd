import org.junit.Test
import org.junit.Assert.*

import axle.cicd.foo.Foo
class TestFoo:
  @Test def testX(): Unit =
    val foo = Foo(3.14, 2.7)
    assertEquals(foo.x, 3.14, 0.00001)
