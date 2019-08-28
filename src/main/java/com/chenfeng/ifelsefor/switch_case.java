package com.chenfeng.ifelsefor;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class switch_case {
    public static void main(String[] args) {
        // displayMonth();
        judegSoundmark();
    }

    public static void displayMonth() {
        int month = (int) (1 + 12 * Math.random());
        System.out.println("月份：" + month);
        switch (month) {
            case 1:
                System.out.println("一月份！过年了！");
                break;
            case 2:
                System.out.println("二月份！开春了！");
                break;
            default:
                System.out.println("该干嘛干嘛！");
                break;
        }
    }

    public static void judegSoundmark() {
        char c = 'a';
        int rand = (int) (26 * Math.random());
        char c2 = (char) (c + rand);
        System.out.println(c2 + "：");

        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}
