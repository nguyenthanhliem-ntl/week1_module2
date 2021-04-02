import java.util.Scanner;

public class pt_bac1 {
    public static void main(String[] args) {


    System.out.println("Linear Equation Resolver");
    System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
    Scanner bac1 = new Scanner(System.in);

    System.out.print("nhap a:");
    double a = bac1.nextDouble();

    System.out.print("nhap b: ");
    double b = bac1.nextDouble();

    System.out.print("nhap c: ");
    double c = bac1.nextDouble();

    if (a != 0) {
        double kq = -b/a;
        System.out.print(kq);
    } else {
        if(b == 0) {
            System.out.println(" pt vo so n ");
        }else{
            System.out.println(" pt vo n");
        }
    }
}
}