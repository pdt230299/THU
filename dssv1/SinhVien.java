package dssv1;

import java.util.*;
import java.util.logging.SimpleFormatter;
import java.text.*;

public class SinhVien {
       private String masv,ten, lop;
       private Date ngaySinh;
       private float gpa;
       
	public SinhVien(int masv, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
		this.masv = "B20DCCN" + String.format("%03d", masv);
		this.ten = ten;
		this.lop = lop;
		this.ngaySinh =new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return  masv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)+ " " + String.format("%.2f", gpa); 
	}
       
	
       
       
	   
}
