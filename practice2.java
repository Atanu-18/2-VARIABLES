// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        float PI = 3.14F;
        float area = PI * radius * radius;
        System.out.println(area);
        
        sc.close();
    }
}
