package liet_ke_sinh_vien_theo_lop;

public class SinhVien {
    public String ma, ten, lop, email;

	public SinhVien(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}
	@Override
	public String toString() {
		return  ma + " " + ten + " " + lop + " " + email;
	}
     
	
}
