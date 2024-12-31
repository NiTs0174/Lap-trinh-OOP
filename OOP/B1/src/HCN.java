import java.util.*;
public class HCN {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		float a,b;
		System.out.print("Nhap chieu dai: ");
		a = x.nextFloat();
		System.out.print("Nhap chieu rong: ");
		b = x.nextFloat();
		
		double p,s;
		p = (a+b)*2;
		s = a*b;
		
		System.out.print("Chu vi = " + p + "\nDien tich = " + s);

	}

}