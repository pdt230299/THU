package danh_sach_doi_tuong_nhan_vien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NhanVien {
       private String ma, ten, gioiTinh, diaChi, maThue;
       private Date ngaySinh, ngayKi;
	public NhanVien(int ma, String ten, String gioiTinh,  String ngaySinh, String diaChi, String maThue, String ngayKi) throws ParseException {
		this.ma = String.format("%05d", ma);
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.maThue = maThue;
		this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
		this.ngayKi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKi);
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)+" "+
	    diaChi + " "+ maThue + " "+ new SimpleDateFormat("dd/MM/yyyy").format(ngayKi);
	}
	
	
       
}
