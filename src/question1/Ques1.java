package question1;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Definition obj = new Definition(str);
        obj.index();
    }
}

class Definition {
    private String str;

    public Definition(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr() {
        this.str = str;
    }

    //int n= str.length();
    public void index() {
        System.out.print("index: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.print("chars: ");
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j) + "\t");
        }
    }
}
