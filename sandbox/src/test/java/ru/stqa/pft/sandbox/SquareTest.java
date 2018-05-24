package ru.stqa.pft.sandbox;


import org.testng.annotations.Test;
import ru.srqa.pft.sandbox.Square;

public class SquareTest {

@Test
  public void testArea () {
    Square s = new Square(5);
    assert s.area() == 25;
  }
}
