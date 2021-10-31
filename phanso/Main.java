package phanso;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		PhanSo phanSo = new PhanSo(input.nextLong(), input.nextLong());
		phanSo.rutGon();
		System.out.println(phanSo);
	}
}
