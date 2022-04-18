import org.junit.Test
import org.junit.Assert.*

class TestBar:
  @Test def t1(): Unit = 
    assertEquals("I was compiled by Scala 3. :)", msg)

  @Test def t2(): Unit =
    val bar = Bar("Cheers", 10)
    assertEquals(bar.name, "Cheers")