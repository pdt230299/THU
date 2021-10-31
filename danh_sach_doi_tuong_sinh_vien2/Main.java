package danh_sach_doi_tuong_sinh_vien2;

import java.text.ParseException;
import java.util.*;

public class Main {
       public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		ArrayList<SinhVien> danhsach = new ArrayList();
		for(int i=1; i<=n; i++) {
			SinhVien sinhVien = new SinhVien(i, input.nextLine(), input.nextLine(), 
					input.nextLine(), Float.parseFloat(input.nextLine()));
			danhsach.add(sinhVien);
		}
		for(int i=0; i<n; i++) {
			System.out.println(danhsach.get(i));
		}
	}
} 
