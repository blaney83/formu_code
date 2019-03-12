// if mean is known, it may be passed as a second parameter and
// the first loop may be removed.
protected double standardDeviation(final double[] someData){

    double sum = 0.0;
    double mean = 0.0;
    double n = 0;

    for(double data : someData){
        sum += data;
        n++;
    }

    mean = sum / n;

    sum = 0;

    for(double data : someData){
        sum += Math.pow((data - mean), 2);
    }
    //using e ^ (natural log / root) improves accuracy
    double stdDev = Math.pow(Math.E, (Math.log(sum/n)/2));

    return stdDev;
}



