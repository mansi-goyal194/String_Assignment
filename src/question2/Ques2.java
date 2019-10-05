package question2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int lowerIndex = scanner.nextInt();
        int upperIndex = scanner.nextInt();
        SubString sub = new SubString(str, lowerIndex, upperIndex);
        sub.subFunc();
    }
}

class SubString {
    private String str;
    private int lowerIndex;
    private int upperIndex;

    public SubString(String str, int lowerIndex, int upperIndex) {
        this.lowerIndex = lowerIndex;
        this.str = str;
        this.upperIndex = upperIndex;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getLowerIndex() {
        return lowerIndex;
    }

    public void setLowerIndex(int lowerIndex) {
        this.lowerIndex = lowerIndex;
    }

    public int getUpperIndex() {
        return upperIndex;
    }

    public void setUpperIndex(int upperIndex) {
        this.upperIndex = upperIndex;
    }

    public void subFunc() {
        System.out.println(str.substring(lowerIndex, upperIndex));
    }
}

