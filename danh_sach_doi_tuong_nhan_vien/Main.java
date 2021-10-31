package danh_sach_doi_tuong_nhan_vien;

import java.text.ParseException;
import java.util.*;

public class Main {
       public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		ArrayList<NhanVien> danhSach = new ArrayList();
		for(int i=1; i<=n; i++) {
			NhanVien nhanVien = new NhanVien(i, input.nextLine(), input.nextLine(), input.nextLine(), 
					input.nextLine(), input.nextLine(), input.nextLine());
			danhSach.add(nhanVien);
		}
		for(int i=0; i<n; i++) {
			System.out.println(danhSach.get(i));
		}
	}
}
