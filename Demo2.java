import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();  //A
        System.out.println(x);     //A -->65--> binary form of A
        System.out.println((char)x);    //A
        // If I want to print Full Word
        // String s = "";
        // int c;
        // while ( c != 'n') {
        //     c = System.in.read();
        //     s = s + c;
        // }
        // System.out.println(s);
    }
}

// read() --> it read one byte at a time
//  If I want print My name like Vivek it's print only--- V---(ivek)--Input Buffer
