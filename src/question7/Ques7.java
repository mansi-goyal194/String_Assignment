package question7;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TotalWeight obj = new TotalWeight(str);
        System.out.println(obj.totalWt());
    }
}

class TotalWeight {
    private String str;
    private int total = 0;

    public TotalWeight(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int totalWt() {
        for (int i = 0; i < str.length(); i++) {
            total = total + str.charAt(i);
        }
        return total;
    }
}