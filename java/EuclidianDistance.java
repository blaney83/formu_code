package formucode;

public class EuclidianDistance {

	public double calculate(final double[] pointOne, final double[] pointTwo) {

		if (pointOne.length != pointTwo.length) {
			
			return -1;
			
		}

		double currSum = 0;
		
		for (int i = 0; i < pointOne.length; i++) {
			
			double diff = (pointOne[i] - pointTwo[i]);
			
			currSum += (diff * diff);

		}
		
		double finalValue = Math.sqrt(currSum);
		
		return finalValue;
	}
}
