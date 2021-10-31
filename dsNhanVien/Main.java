package dsNhanVien;

import java.text.ParseException;
import java.util.*;

public class Main {
		 public static void main(String[] args) throws ParseException {
			Scanner input = new Scanner(System.in);
			int n = Integer.parseInt(input.nextLine());
			ArrayList<NhanVien> danhsach = new ArrayList<>();
			for(int i = 1; i<=n; i++) {
				NhanVien nhanvien = new NhanVien(i, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
				danhsach.add(nhanvien);
			}
			
			Collections.sort(danhsach);
			
			for(int i=0; i<n; i++) {
				System.out.println(danhsach.get(i));
			}
		}
}
