package dsNhanVien;

import java.util.*;
import java.text.*;

public class NhanVien implements Comparable<NhanVien> {
      private String manv, ten, gioiTinh, diaChi, maSoThue;
      private Date ngaySinh, ngayKiHd;
	public NhanVien( int manv, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHd) throws ParseException {
		this.manv = String.format("%05d", manv);
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.diaChi = diaChi;
		this.maSoThue = maSoThue;
		this.ngayKiHd = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKiHd);
	}
	@Override
	public String toString() {
		return manv + " " + ten + " " + gioiTinh +" "+ new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)+ " " + diaChi + " " + maSoThue + " " 
	    +  " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKiHd);
	}
	
	@Override
	public int compareTo(NhanVien o) {
		   return this.ngaySinh.compareTo(o.ngaySinh);
	}
	
	
}
