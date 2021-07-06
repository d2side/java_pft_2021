package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stq.pft.sandbox.Square;

public class SquareTests {

    @Test
     public void testArea() {
         Square s = new Square(7);
        Assert.assertEquals(s.area(), 49);
     }
}
