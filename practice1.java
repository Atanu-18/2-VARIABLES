// Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();  //nextfloat()
        System.out.println(age);

        sc.close();
    }
}
