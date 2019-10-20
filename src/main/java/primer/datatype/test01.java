package primer.datatype;

public class test01 {
    public static void main(String[] args) {
       /* double d = 5.7D;
        float f = (float) 5.75D;
        int i = (int) 1000000000000L;*/
        int[] arr1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println((int) '0');
        System.out.println((int) '中');
    }
}
