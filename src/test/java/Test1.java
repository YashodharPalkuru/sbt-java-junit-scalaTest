import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Test1 extends org.scalatest.junit.JUnitSuite{

    @Test
    public void testAdd(){
        double result= 2 + 4;
        assertTrue(result == 6);
        System.out.println("Test1 Passed");
    }
}
