package testcases;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num=12345;
		long rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse th numIs::" +rev);
		long num1=12345;
		StringBuffer sf=new StringBuffer(String.valueOf(num1));
		System.out.println( sf.reverse());
	}

}
