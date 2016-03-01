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

/**
 *
 * @author Lefty G Balogh
 */
public class Geometry101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test dist from base
        System.out.println("dist from base");
        Point point = new Point(3, 4);
        point.printPosition();
        double d = point.returnDistanceFromBase();
        System.out.println("distance="+d);
        
        //test dist from point
        System.out.println("dist from point");
        Point pointB = new Point(6, 9);
        d = point.returnDistanceFromPointB(pointB);
        System.out.println("distance="+d);
        
        //test move by vector
        System.out.println("move by vector");
        Point vector = new Point(-2, 9);
        Point pointC = point.movePointByVector(vector);
        pointC.printPosition();
        
        
    }
    
}
