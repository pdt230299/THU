package sap_xep_theo_ma_sv;

public class SinhVien implements Comparable<SinhVien> {
       private String ma, ten, lop, email;

	public SinhVien(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	
	@Override
	public int compareTo(SinhVien o) {
		return ma.compareTo(o.ma);
	}


	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}
	
     
	
}
