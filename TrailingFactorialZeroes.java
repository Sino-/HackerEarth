//Finds the trailing zeroes of a factorial

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static int trailingZeroes(int N) {
        int zeroes = 0;
        int multiple = 5;
        
        while (multiple < N) {
        	zeroes += N / multiple;
        	multiple *=5;
        }
        
        return zeroes;
	}
	
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        /*
        double factorial = 1;
        for (int i = N; i > 0; i--) {
        	factorial*=i;
        }
		*/
		
		System.out.println(trailingZeroes(N));
    }
}

/*
Score     Time (sec)      Memory (KiB)
20        0.403344          64

Input 	Time (sec)	Memory (KiB)
 #1	  	 0.101095	    64	
 #2	     0.100732	    64	
 #3	  	 0.100734	    64	
 #4	  	 0.100783    	64
*/
