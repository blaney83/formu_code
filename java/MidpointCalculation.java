package formucode;

public class MidpointCalculation {

	protected double[] ArrayMidpoint(final double[] firstPoint, final double[] secondPoint){

	    if(firstPoint.length != secondPoint.length){
            throw new ArrayIndexOutOfBoundsException("Points A and B exist in different dimensional space.");
        }

        double[] midpoint = new double[firstPoint.length];
        
        for(int i = 0; i < midpoint.length; i ++){
            midpoint[i] = (firstPoint[i] + secondPoint[i]) / 2;
        }

	    return midpoint;
	}
}
