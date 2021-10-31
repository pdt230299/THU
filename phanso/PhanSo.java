package phanso;

public class PhanSo {
       private long tuso, mauso;

	public PhanSo(long tuso, long mauso) {
		super();
		this.tuso = tuso;
		this.mauso = mauso;
	}

	@Override
	public String toString() {
		return tuso +"/"+ mauso;
	}	
      
	public void rutGon() {
		long x = usc(tuso,mauso);
		
		tuso/=x;
		mauso/=x;
	}
	
	public long usc(long a, long b) {
		long t;
		while(b>0) {
			t = a%b;
			a = b;
			b = t;
		}
		return a;
	}
}
