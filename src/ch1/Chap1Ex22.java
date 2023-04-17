package ch1;
// Example for BufferedReader with InputStreamReader.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap1Ex22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name= br.readLine();

        System.out.print("Enter your age: ");
        int age= Integer.parseInt(br.readLine());

        System.out.print("Enter your marks: ");
        double marks= Double.parseDouble(br.readLine());

        System.out.println(name+ " is "+ age+ " years old");
        System.out.println(name+ " scored "+ marks+ " marks");
    }
}
