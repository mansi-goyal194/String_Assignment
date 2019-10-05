package question9;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        AbsoluteWeight obj = new AbsoluteWeight(str);
        obj.absWt();
    }
}

class AbsoluteWeight {
    private String str;
    private int upWt = 0;
    private int lowWt = 0;

    public AbsoluteWeight(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void absWt() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upWt = upWt + str.charAt(i);
            }
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lowWt = lowWt + str.charAt(i);
            }
        }
        if (upWt > lowWt) {
            System.out.println(upWt - lowWt);
        } else
            System.out.println(lowWt - upWt);
    }
}