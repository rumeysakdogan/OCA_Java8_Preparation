package q_02;

public class Question2 {

    public static void main(String[] args) {

        //Q: What is the result?

        int i = 10;
        int j = 20;
        int k = (j += i)/ 5;   // k = ( 20+10)/5  --> k=6
        System.out.print(i + " : " + j + " : " + k);  // 10 : 30 : 6

    }
}
