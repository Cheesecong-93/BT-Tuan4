import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = scanner.nextDouble();

        System.out.println("Chon phep toan:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Lua chon cua ban: ");
        int choice = scanner.nextInt();

        double ketQua;

        switch (choice) {
            case 1:
                ketQua = a + b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case 2:
                ketQua = a - b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case 3:
                ketQua = a * b;
                System.out.println("Ket qua: " + ketQua);
                break;
            case 4:
                if (b != 0) {
                    ketQua = a / b;
                    System.out.println("Ket qua: " + ketQua);
                } else {
                    System.out.println("Loi: Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }

        scanner.close();
    }
}
