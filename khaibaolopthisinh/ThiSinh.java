package khaibaolopthisinh;

public class ThiSinh {
       private String hoten, ngaySinh;
       private float d1, d2, d3, tong;
	public ThiSinh(String hoten, String ngaySinh, float d1, float d2, float d3) {
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.tong = this.d1 + this.d2 +this.d3;
	}
	@Override
	public String toString() {
		return hoten +" "+ ngaySinh +" "+String.format("%.1f", tong);
	}
	
	
       
       
}
