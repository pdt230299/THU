package sap_xep_sinh_vien_theo_lop;

import java.util.*;

public class Main {
      public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   ArrayList<SinhVien> danhsach = new ArrayList();
		   int n = Integer.parseInt(input.nextLine());
		  
		   for(int i=0; i<n; i++) {
			   SinhVien sinhVien = new SinhVien(input.nextLine(), input.nextLine(),
					   input.nextLine(), input.nextLine());
			   danhsach.add(sinhVien);
		   }
		   Collections.sort(danhsach);
		   for(int i=0; i<n; i++) {
			   System.out.println(danhsach.get(i));
		   }
	}
}
