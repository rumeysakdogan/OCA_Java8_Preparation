package q_50;

public class Q050 {
    //  Which two code fragments cause compilation errors? (Choose two.)
    public static void main(String[] args) {
      //  double y1 = 203.22; float fit = y1; //Type mismatch: cannot convert from double to float

        float fit1 = (float) 1_11.0;

      //  Float fit2  =  100.00; 						// Type mismatch: cannot convert from double to Float

        int y2 = 100; float fit3= (float)y2;

        float fit4 = 100.00F;

        /**
         *  Which two code fragments cause compilation errors? (Choose two.)
         * A. double y1 = 203.22; float fit = y1;
         * B. float fit = (float) 1_11.00;
         * C. Float fit = 100.00;
         * D. int y2 = 100;
         * float fit = (float) y2; E. float fit = 100.00F;
         */
    }
}
