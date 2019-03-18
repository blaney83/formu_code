package formucode;

public class PrimeTester {

    public int testPrime(final int maybePrime){

        int count = 2;

        while(count < (maybePrime/2)){
            if(maybePrime % count == 0){
                return count;
            }

        }
        return 0;
    }
	
}
