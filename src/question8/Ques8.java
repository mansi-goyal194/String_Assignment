package question8;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        UpperWeight obj = new UpperWeight(str);
        System.out.println(obj.upperWt());
    }
}

class UpperWeight {
    private String str;
    private int upWt = 0;

    public UpperWeight(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int upperWt() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upWt = upWt + str.charAt(i);
            }
        }
        return upWt;
    }
}
