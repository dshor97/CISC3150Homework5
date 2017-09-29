import java.math.BigDecimal;
import java.math.BigInteger;

public class Question1 {
	public static void main(String[] args){
		BigInteger totalPoints = new BigInteger("4000000000");
		BigInteger numPoints = new BigInteger("4000000000");
		BigInteger numInCircle = new BigInteger("0");
		BigInteger val = new BigInteger("0");
		BigInteger sub1 = new BigInteger("-1");
		BigInteger add1 = new BigInteger("1");
		Point origin = new Point();
		
		while(numPoints.compareTo(val) == 1){
			if(checkInCircle(new Point(Math.random() ,Math.random()),origin)){
				numInCircle = new BigInteger(numInCircle.add(add1).toString());
			}
			numPoints = new BigInteger (numPoints.add(sub1).toString());
		}
		
		BigDecimal numInCircDec = new BigDecimal(numInCircle);
		BigDecimal numTotal = new BigDecimal(totalPoints);
		
		System.out.println("There are: " + totalPoints + " points in total. There are: " 
								+ numInCircle + " points in the circle. The ratio between the points in the circle "
										+ "and total points is " + numInCircDec.divide(numTotal) + ". This is the aproximate value of pi/4. "
												+ "This means that the aprocimate value of pi is " + numInCircDec.divide(numTotal).multiply(new BigDecimal("4")));
	}
	public static boolean checkInCircle(Point p1, Point p2){
		return Math.sqrt(Math.pow(p1.y-p2.y,2) + Math.pow(p1.x - p2.x, 2)) <= 1 ? true:false;
	}
}
class Point{
	double x;
	double y;
		
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		this.x = 0;
		this.y = 0;
	}
}

