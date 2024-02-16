
package test;

import static junit.framework.TestCase.assertEquals;
import jx.zero.CycleTime;
import jx.zero.VMSupport;
import org.junit.Test;

/**
 *
 * @author spy
 */
public class JUnitTest {
    @Test
    public void testCycleTime(){
        System.out.println("* JUnitTest: CycleTime");
        CycleTime time = new CycleTime();
        time.high = 3;
        time.low = 2;
        assertEquals(time.subtract(time).high, 0);
        assertEquals(time.subtract(time).low, 0);
    }
    
    @Test
    public void testVMSupport(){
        System.out.println("* JUnitTest: VMSupport");
        assertEquals(VMSupport.swapShortByteOrder((short)1), 256);
        assertEquals(VMSupport.swapIntByteOrder(3), 50331648);
    }
}
