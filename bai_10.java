import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Them phan tu");
        System.out.println("2. Xoa phan tu");
        System.out.print("Chon: ");
        int c = sc.nextInt();

        if (c == 1) {
            System.out.print("Nhap gia tri can them: ");
            int x = sc.nextInt();
            System.out.print("Nhap vi tri can them (0.." + n + "): ");
            int k = sc.nextInt();
            for (int i = n; i > k; i--) {
                arr[i] = arr[i - 1];
            }
            arr[k] = x;
            n++;
        } else if (c == 2) {
            System.out.print("Nhap vi tri can xoa (0.." + (n - 1) + "): ");
            int k = sc.nextInt();
            for (int i = k; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

        System.out.println("Danh sach sau khi xu ly:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
