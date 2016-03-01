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
public class Point {
    double horizontal;
    double vertical;

    public Point() {
    }

    public Point(double horizontal, double vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public double getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }

    public double getVertical() {
        return vertical;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }
    
    public void printPosition(){
        System.out.println("This point has the following coordinates:");
        System.out.println("Horizontal aka X coordinate: "+ this.getHorizontal());
        System.out.println("Vertical aka Y coordinate: "+this.getVertical());
    }
    
    public double returnDistanceFromBase(){
        double distance;
        double pithagoreanSquare = Math.pow(this.getHorizontal(), 2)+Math.pow(this.getVertical(), 2);
        distance = Math.sqrt(pithagoreanSquare);
        return distance;                
    }
    
    public double returnDistanceFromPointB (Point pointB){
        double xDistance=0, yDistance=0, distance;
        
        xDistance = pointB.getHorizontal()-this.getHorizontal();
        yDistance = pointB.getVertical() - this.getVertical();
        double pithagoreanSquare = Math.pow(xDistance,2)+Math.pow(yDistance, 2);
        distance = Math.sqrt(pithagoreanSquare);
        return distance;   
        
    }
    
    public Point movePointByVector (Point vector){
        Point newPoint = new Point();
        
        newPoint.setHorizontal(this.getHorizontal()+vector.getHorizontal());
        newPoint.setVertical(this.getVertical() + vector.getVertical());
        
        
        return newPoint;
    }
}
