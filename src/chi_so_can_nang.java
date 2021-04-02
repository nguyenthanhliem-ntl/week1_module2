import java.util.Scanner;

public class chi_so_can_nang {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in) ;

        System.out.println("nhap can nang");
        int weight = people.nextInt();

        System.out.println("nhap chieu cao");
        float height = people.nextFloat();

        double bmi = weight/ Math.pow(height,2);
        System.out.println("chi so bmi cua ban "+ bmi);

        if(bmi>=30) {
            System.out.println("obese");
        }else if(bmi >=25.0) {
            System.out.println("Overweight");
        }else if(bmi>=18.5) {
            System.out.println("Normal");
        }else if(bmi<18.5) {
            System.out.println("Underweight");
        }
    }
}
