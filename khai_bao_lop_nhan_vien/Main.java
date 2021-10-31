package khai_bao_lop_nhan_vien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) throws ParseException {
			 Scanner input = new Scanner(System.in);
			 NhanVien nhanVien = new NhanVien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),
					 input.nextLine(), input.nextLine());
			 System.out.println(nhanVien);
		}
}
