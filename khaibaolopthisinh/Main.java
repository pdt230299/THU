package khaibaolopthisinh;

import java.util.Scanner;

public class Main {
			public static void main(String[] args) {
	               Scanner input = new Scanner(System.in);			
	               ThiSinh thiSinh = new ThiSinh(input.nextLine(), input.next(), input.nextFloat(), input.nextFloat(), input.nextFloat());
	               System.out.println(thiSinh);
			}
}
