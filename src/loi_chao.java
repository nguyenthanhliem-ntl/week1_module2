import java.util.Scanner;

public class loi_chao {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);

        System.out.println("nhap ten cua ban :" );
        String name = mes.nextLine();
        System.out.println("Hello! "+name);

        System.out.println("ban muon di dau");
        String adre = mes.nextLine();
        System.out.println(" ban muon di "+ adre + " phai khong ?");


    }
}
