package ALG;

/**
 * @author ：chenfeng
 * @date ：Created in 2019-10-09 21:11
 * @description：
 */
public class PrintAscii {
    public void dispAscii(char ch) {
        int iTmp = (int) ch;
        System.out.println(ch + "的Ascii码是" + iTmp);
    }

    public static void main(String[] args) {
        PrintAscii obj = new PrintAscii();
        obj.dispAscii('0');
        obj.dispAscii('9');
        obj.dispAscii('A');
        obj.dispAscii('Z');
        obj.dispAscii('a');
        obj.dispAscii('z');
    }
}
