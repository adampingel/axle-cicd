import org.junit.Test
import org.junit.Assert.*

import axle.cicd.bar.Bar

class TestBar:
  @Test def testName(): Unit =
    val bar = Bar("Cheers", 10)
    assertEquals(bar.name, "Cheers")
