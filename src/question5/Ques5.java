package question5;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("enter substring that is to be replaced:");
        String str1 = sc.nextLine();
        System.out.println("enter substring that is to be placed in place of above substring: ");
        String str2 = sc.nextLine();
        str = str.replace(str1, str2);
        System.out.println("new string is : " + str);
    }
}