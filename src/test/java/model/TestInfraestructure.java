package model;
import org.junit.*;
import org.junit.Assert;

public class InfraestructureTest {

    @Test
    public void test()throws Exception{
        InfraestructureTest in = new InfraestructureTest();
        double average = in.averageHeight();
        Assert.assertEquals(2.0,average,0);
    }


}
