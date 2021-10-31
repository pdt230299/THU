package bang_diem_hoc_sinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String name = sc.nextLine();
            Double diemTb = 0.0;
            for (int j = 0; j < 9; j++) {
                if (j != 0 && j != 1) diemTb += sc.nextDouble();
                else diemTb += sc.nextDouble() * 2.0;
                diemTb = Math.round(diemTb * 10.0) / 10.0;
            }
            diemTb += Double.parseDouble(sc.nextLine());
            HocSinh hocSinh = new HocSinh(i, name, Double.parseDouble(String.format("%.1f", Math.round((diemTb / 12.0f) * 10.0) / 10.0)));
            list.add(hocSinh);
        }
        Collections.sort(list);
        for (HocSinh hocSinh : list)
            System.out.println(hocSinh);
    }
}

