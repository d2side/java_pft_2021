package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stq.pft.sandbox.Point;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(9.0, 8.0);
        Point p2 = new Point(4.0, 17.0);
        double res = p1.distance(p1, p2);
        double expected = 10.296;
        String result = String.format("%.3f", res);
        Assert.assertEquals(result,  Double.toString(expected));
    }
}
