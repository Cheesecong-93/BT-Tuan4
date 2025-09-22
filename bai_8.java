import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> dem = new HashMap<>();

        for (int num : arr) {
            dem.put(num, dem.getOrDefault(num, 0) + 1);
        }

        int phanTuNhieuNhat = arr[0];
        int soLanXuatHienMax = dem.get(phanTuNhieuNhat);

        for (Map.Entry<Integer, Integer> entry : dem.entrySet()) {
            if (entry.getValue() > soLanXuatHienMax) {
                soLanXuatHienMax = entry.getValue();
                phanTuNhieuNhat = entry.getKey();
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat la: " + phanTuNhieuNhat);
        System.out.println("So lan xuat hien: " + soLanXuatHienMax);

        sc.close();
    }
}
