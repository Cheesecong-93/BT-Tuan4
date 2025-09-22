import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        int ucln = timUcln(a, b);
        int bcnn = (a * b) / ucln;

        System.out.println("UCLN: " + ucln);
        System.out.println("BCNN: " + bcnn);

        sc.close();
    }

    public static int timUcln(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
