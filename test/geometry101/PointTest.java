/*
 * Code is prose.
 * 
 * The code is mine. You are free to use it.
 * I put a lot of effort into it so it does what I want it to do.
 * If you use it, you do so at your own risk.
 * If you use it, keep this license and the reference to my profiles.
 * Other than that, have fun.
 * 
 * Lefty G Balogh
 * https://www.linkedin.com/in/leftygbalogh
 * https://github.com/leftygbalogh
 */

package geometry101;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lefty G Balogh
 */
public class PointTest {
    
   

    /**
     * Test of printPosition method, of class Point.
     */
    @Test
    public void testPrintPosition() {
        System.out.println("printPosition - 12.3, 8.97");
        Point instance = new Point();
        instance.setHorizontal(12.3);
        instance.setVertical(8.97);
        instance.printPosition();
        
    }

    /**
     * Test of returnDistanceFromBase method, of class Point.
     */
    @Test
    public void testReturnDistanceFromBase() {
        System.out.println("returnDistanceFromBase");
        Point instance = new Point();
        instance.setHorizontal(3);
        instance.setVertical(4);
        double expResult = 5.0;
        double result = instance.returnDistanceFromBase();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of returnDistanceFromPointB method, of class Point.
     */
    @Test
    public void testReturnDistanceFromPointB() {
        System.out.println("returnDistanceFromPointB");
        Point pointB = new Point(3,4);
        Point instance = new Point(6,8);
        double expResult = 5.0;
        double result = instance.returnDistanceFromPointB(pointB);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of movePointByVector method, of class Point.
     */
    @Test
    public void testMovePointByVector() {
        System.out.println("movePointByVector");
        Point vector = new Point(1,1);
        Point instance = new Point(8,5);
        Point expResult = new Point(9,6);
        Point result = instance.movePointByVector(vector);
        assertTrue(expResult.getHorizontal()== result.getHorizontal());
        assertTrue(expResult.getVertical()== result.getVertical());
        
    }
    
    
}
