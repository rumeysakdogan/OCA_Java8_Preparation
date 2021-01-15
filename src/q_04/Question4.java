package q_04;

public class Question4 {

    public static void main(String[] args) {

        // Q: Which code fragment, inserted at line n1, prints The Top element: 30?

        int[] stack = {10,20,30};
        int size = 3;
        int idx = 0;
        /* line n1  */
        do{                            // 1 < 2
            idx++;                      // 2 < 2 false exit the loop idx = 2
        }while( idx < size-1);
        System.out.print("The Top element: " + stack[idx]);
        // To print 30 --> idx = 2

        /*
        Solution:
         do{                            // 1 < 2
            idx++;                      // 2 < 2 false exit the loop idx = 2
          }while( idx < size-1);

         */

    }
}
