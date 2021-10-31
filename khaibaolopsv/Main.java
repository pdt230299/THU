package khaibaolopsv;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
	     Scanner input = new Scanner(System.in);
	     SinhVien sv = new SinhVien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextFloat());
	     System.out.println(sv);
	}
}
