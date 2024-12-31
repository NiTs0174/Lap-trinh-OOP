import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		float r;
		System.out.print("Nhap ban kinh: ");
		r = x.nextFloat();
		
		double cv, dt;
		cv = Math.PI*2*r;
		dt = Math.PI*r*r;
		
		System.out.print("Chu vi = " + cv + "\nDien tich = " + dt);
				
	}

}