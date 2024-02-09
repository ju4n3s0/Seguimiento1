package model;


import org.junit.Test;
import org.junit.*;

public class TestBillboard {

    @Test
    public void test() throws Exception {
        TestInfraestructure in = new TestInfraestructure();
        double average = in.averageHeight();
        Assert.assertEquals(2.0, average, 0);
    }
}
