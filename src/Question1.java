public class Question1 {

    public static void main(String[] args) {

        // Q: What is the result?

        int x = 1;
        int y = 1;
        if(x++ < ++y){      //  x = 1 , y = 2
            System.out.print("Hello ");  // Hello
        }else{
            System.out.print("Welcome ");  // x= 2 ,y = 2
        }
        System.out.print("Log " + x + ":" + y);

        // Result: Hello Log 2:2
    }
}
