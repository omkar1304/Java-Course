/*
        Topic : User input using Scanner
*/

import java.util.Scanner;

public class JavaCode30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // create scanner object
        System.out.println("Enter any number");
        int n = sc.nextInt();  // using scanner object we can take any type of input from user
        System.out.print(n);
    }
}
