import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();  //next  //nextInt //nextFloat........
        System.out.println(name);



        sc.close(); // fixed for sc &remove warning
    }
}
