import java.util.Scanner;

public class doinhietdo {
    public static double CtoF(double C) {
        double F = (9.0 /5) * C + 32;
        return F;
    }

    public static double FtoC(double F) {
        double C = (5.0/9) * (F -32);
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choise;
        do {
            System.out.println("menu.");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.print("nhập số bạn muốn: ");
            choise = sc.nextInt();
            switch (choise){
                case 1:
                    System.out.print("nhập số F: ");
                    F = sc.nextDouble();
                    System.out.println("F to C : "+ FtoC(F));
                    break;
                case 2:
                    System.out.print("nhập số C: ");
                    C = sc.nextDouble();
                    System.out.println("C to F: "+ CtoF(C));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choise != 0);
    }
}
