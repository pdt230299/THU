package tinh_thu_nhap_giao_vien;

public class GiaoVien {
       private String ma, ten;
       private long luongcb, phucap, luong;
       
	public GiaoVien(String ma, String ten, long luongcb) {
		this.ma = ma;
		this.ten = ten;
		this.luongcb = luongcb;
	}
	
	public long phucap() {
		String s = ""+(char)this.ma.charAt(0) + this.ma.charAt(1);
		if(s.equals("HT")) this.phucap = 2000000;
		else if(s.equals("HP")) this.phucap = 900000;
		else if(s.equals("GV")) this.phucap = 500000;
		return this.phucap;
	}
	public int bacLuong() {
		int bacLuong = (this.ma.charAt(2)-48)*10 + (this.ma.charAt(3)-48);	
		return bacLuong;
	}
	
	public long luong() {
		this.luong = luongcb * bacLuong() + phucap();	
		return this.luong;
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " "+ bacLuong() +" "+ phucap() + " " + luong();
	}

       
       
}
