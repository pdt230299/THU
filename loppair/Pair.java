package loppair;

public class Pair {
       private int a;
       private int b;
	   public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	   
	   public boolean isPrime() {
		   return check(this.a) && check(this.b);		   
	   }
	   
	   private boolean check(int number) {
		   if(number<2) return false;
		   for(int i=2; i<= Math.sqrt(number); i++) {
			   if(number%i == 0) return false;
		   }
		   return true;
	   }

	@Override
	public String toString() {
		return a + " " + b;
	}

	   
	   
       
}
