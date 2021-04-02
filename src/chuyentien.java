import java.util.Scanner;

public class chuyentien {
    public static void main(String[] args) {
        Scanner vn = new Scanner(System.in);
        int a = 23000;

        System.out.println("Nhập Sô USD: ");
        int dola = vn.nextInt();
        int vna = dola *a ;
        System.out.println(vna);

    }
}
