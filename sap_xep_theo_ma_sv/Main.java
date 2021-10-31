package sap_xep_theo_ma_sv;

import java.util.*;

public class Main {
       public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
    	 ArrayList<SinhVien> danhsach = new ArrayList();
    	 while(input.hasNext()) {
			SinhVien sinhVien =  new SinhVien(input.nextLine(), input.nextLine(),
					input.nextLine(), input.nextLine());
			    danhsach.add(sinhVien);				
		 }
    	 Collections.sort(danhsach);
		 for(int j=0; j< danhsach.size(); j++) {
				System.out.println(danhsach.get(j));
			}
		}
	}
