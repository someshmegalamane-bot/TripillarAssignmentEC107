package exceptions;
// scanner vs bufferreader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ExceptionHandling {
        public static void main(String[] args)throws IOException {
            String name;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter some name:");
            name = br.readLine();
            System.out.println("you entered :" + name);
        }
    }
