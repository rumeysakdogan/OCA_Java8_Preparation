import java.io.IOException;

public class Question6 {
}
    class X{
        public void printFileContent() throws IOException{
            /*code goes here */
            throw new IOException();
        }
    }
    class Test {
        public static void main(String[] args) throws Exception {
            X xobj = new X();
            xobj.printFileContent();
        }
    }

/*
Q:
Which two modifications should you make so that the code compiles successfully? (Choose two.)
add  throws IOException line 5, add throws Exception to line 11
 */
