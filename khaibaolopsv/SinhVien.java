package khaibaolopsv;

import java.text.*;
import java.util.*;

public class SinhVien {
       private String  maSv = "B20DCCN001";
       private String hoTen, lop;
       private Date ngaySinh;
       private float gpa;
       
	

	public SinhVien(String hoTen, String lop, String ngaySinh, float gpa) throws ParseException {
		this.maSv = "B20DCCN001";
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return   maSv + " " + hoTen + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
	}
	
       
}
