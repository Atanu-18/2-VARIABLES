import java.util.Scanner;

public class inputQuestion {

    // add two integers using user input
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);


        sc.close();  // fixed for sc &remove warning
    }
}
