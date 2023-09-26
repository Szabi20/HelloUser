import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
       
        Scanner szam = new Scanner(System.in);
        System.out.println("Mi a neve:");
        String name = szam.next();

        
        System.out.printf("Hello, %s!", name);
    }
}