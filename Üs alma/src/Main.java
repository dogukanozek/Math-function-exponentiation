
public class Main {

	public static void main(String[] args) {
	
		 
		 System.out.print(myPow(3,-2));
	}
    public static double myPow(double x, int n) {
    	double i=0,a=1;
    	if(n<0) {
    		n=n*-1;
    		x=1/x;
    	}
        for(i=0;i<n;i++) {
        	a=a*x;
        }
        return a;
    }

}
