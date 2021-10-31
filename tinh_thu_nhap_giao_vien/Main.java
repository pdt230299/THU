package tinh_thu_nhap_giao_vien;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			GiaoVien giaoVien = new GiaoVien(input.nextLine(), input.nextLine(), input.nextLong());
			System.out.println(giaoVien);
		}
}
