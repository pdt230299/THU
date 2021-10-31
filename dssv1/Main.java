package dssv1;

import java.text.ParseException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		ArrayList<SinhVien> danhsach = new ArrayList<>();
		int n = Integer.parseInt(input.nextLine());
		for(int i=1; i<=n; i++) {
			SinhVien sinhvien = new SinhVien(i, input.nextLine(), input.nextLine(), input.nextLine(), Float.parseFloat(input.nextLine()));
			danhsach.add(sinhvien);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(danhsach.get(i));
		}
	}
}
