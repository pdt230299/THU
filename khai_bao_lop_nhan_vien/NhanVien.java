package khai_bao_lop_nhan_vien;

import java.text.*;
import java.util.*;

public class NhanVien {
       private String id, name, gender, address, taxId;
       private Date dateOfBirth, dateOfContract;
       
	public NhanVien( String name, String gender, String dateOfBirth, String address, String taxId, 
			String dateOfContract) throws ParseException {

		this.id = "00001";
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.taxId = taxId;
		this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
		this.dateOfContract = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfContract);
	}

	@Override
	public String toString() {
		return  id+" "+name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth) +" "+ address + " " + taxId + 
	 " " + new SimpleDateFormat("dd/MM/yyyy").format(dateOfContract);
	}

	
       
       
}
