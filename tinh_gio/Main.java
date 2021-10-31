package tinh_gio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
       public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		ArrayList<GameThu> danhsach = new ArrayList();
		int n = Integer.parseInt(input.nextLine());
		for(int i = 0; i < n; i++) {
			GameThu gameThu = new GameThu(input.nextLine(), input.nextLine(), 
					input.nextLine(), input.nextLine());
			danhsach.add(gameThu);
		}
		for(int i=0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(danhsach.get(i).tinhToan() < danhsach.get(j).tinhToan()) {
					Collections.swap(danhsach, i, j);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(danhsach.get(i));
		}
	}
}
