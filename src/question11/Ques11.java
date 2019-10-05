package question11;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        Index obj = new Index(str, ch);
        obj.index();
    }
}

class Index {
    private String str;
    private char ch;

    public Index(String str, char ch) {
        this.str = str;
        this.ch = ch;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void index() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}