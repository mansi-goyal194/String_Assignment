package question3;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        NewStr obj = new NewStr(str);
        obj.newStr();
    }
}

class NewStr {
    private String str;
    private String vowel = "aeiou";

    public NewStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void newStr() {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (str.charAt(i) == vowel.charAt(j)) {
                    str = str.replace(str.charAt(i), '*');
                }
            }
        }
        System.out.println(str);
    }
}