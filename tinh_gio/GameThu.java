package tinh_gio;

import java.sql.*;
import java.text.*;
import java.util.Date;

public class GameThu {
      private String ma, ten;
      private String gioRa, gioVao;
      
	public GameThu(String ma, String ten, String gioVao, String gioRa) throws ParseException {
		this.ma = ma;
		this.ten = ten;
		this.gioVao = gioVao;
		this.gioRa = gioRa;
	}
    
	public int gio() {
		int gioVao = (this.gioVao.charAt(0)-48)*10 + (this.gioVao.charAt(1)-48);
		int gioRa = (this.gioRa.charAt(0)-48)*10 + (this.gioRa.charAt(1)-48);
		int gio = gioRa - gioVao;
		if(phut() < 0 ) return gio-1;
		return gio;
	}
	
	public int phut() {
		int phutVao = (this.gioVao.charAt(3)-48)*10 + (this.gioVao.charAt(4)-48);
		int phutRa = (this.gioRa.charAt(3)-48)*10 + (this.gioRa.charAt(4)-48);
		int phut = phutRa - phutVao;
	    return phut;
	}
	
	public double tinhToan() {
		int phut = 0;
		if(phut() < 0) phut = 60 - Math.abs(phut());
		else phut = phut();
		double thoiGian = gio() + (double)phut/60;
		return thoiGian;
	}

	@Override
	public String toString() {
		int phut = 0;
		if(phut() < 0) phut = 60 - Math.abs(phut());
		else phut = phut();
		return ma + " " + ten + " "+ gio() +" gio " + phut+" phut";
	}

	
}
