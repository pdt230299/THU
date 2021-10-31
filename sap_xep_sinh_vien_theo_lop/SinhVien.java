package sap_xep_sinh_vien_theo_lop;

public class SinhVien  implements Comparable<SinhVien> {
       private String ma, ten, lop, email;

	public SinhVien(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	@Override
	public int compareTo(SinhVien o) {
		int  i = lop.compareTo(o.lop);
		if(i == 0) {
			return ma.compareTo(o.ma);
		}
		return i;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}
	
       
}
