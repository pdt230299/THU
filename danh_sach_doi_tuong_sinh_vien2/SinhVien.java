package danh_sach_doi_tuong_sinh_vien2;

import java.text.*;
import java.util.*;

public class SinhVien {
     private String ma, ten, lop;
     private Date ngaySinh;
     private float gpa;
     
	public SinhVien(int ma, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", ma);
		this.ten = ten;
		this.lop = lop;
		this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.gpa = gpa;
	}
    
	public String chuanhoa() {
		String result = "";
		this.ten = ten.toLowerCase();
		String s[] = this.ten.split(" ");
		for(int i=0; i<s.length; i++) {
			String eachWord = "";
			if(s[i].length() > 0) { 
			eachWord += Character.toUpperCase(s[i].charAt(0));
			eachWord += s[i].substring(1); 
			if(i == s.length-1) result += eachWord;
			else result += eachWord+" ";
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return ma + " " + chuanhoa() + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " "
        + String.format("%.2f", gpa) ;
	}
	
     
}
