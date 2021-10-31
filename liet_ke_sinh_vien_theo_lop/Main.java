package liet_ke_sinh_vien_theo_lop;

import java.util.*;

public class Main {
       public static void main(String[] args) {
	          Scanner input = new Scanner(System.in);
	          int n = Integer.parseInt(input.nextLine());
	          ArrayList<SinhVien> danhsach= new ArrayList();
	          for(int i=0; i<n; i++) {
	        	  SinhVien sinhVien = new SinhVien(input.nextLine(), input.nextLine(), 
	        			  input.nextLine(), input.nextLine());
	        	  danhsach.add(sinhVien);
	          }
	          
	          int m = Integer.parseInt(input.nextLine());
	          String s[] = new String[100];
	          for(int i=0; i<m; i++) {
	        	  s[i] = input.nextLine();
	          }
	          
	         for(int i=0; i<m; i++) {
	        	 System.out.println("DANH SACH SINH VIEN LOP "+s[i]+":");
	        	 for(int j=0; j<n; j++) {
	        		 if(s[i].compareTo(danhsach.get(j).lop)==0) System.out.println(danhsach.get(j));
	        	 }
	         }
	}
}
