import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner nam = new Scanner(System.in);

        System.out.println(" nhap nam: ");
        long nam1 = nam.nextLong();

        boolean art = false;
        if(nam1 % 4 == 0 ) {
            if(nam1 % 100 == 0) {
                if(nam1 %400 ==0) {
                    art = true;
                }
            }else{
                art = true;
            }
        }
        if(art) {
            System.out.println("nam "+ nam1+ " la nam nhuan");
        }else{
            System.out.println("nam "+ nam1+ " khong phai nam nhuan");
        }
    }
}
