
standardDeviation = (numArr) => {

    let sum = 0;
    let n = 0;

    numArr.forEach((val)=>{
        sum += val;
        n ++;
    })

    const mean = sum / n;
    let summation = 0;

    numArr.forEach((val)=>{
        summation += Math.pow((val-mean) , 2);
    })

    const stdDev = Math.pow((summation/n), (1/2));

    return stdDev;
}