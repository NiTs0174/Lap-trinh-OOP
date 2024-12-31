import java.util.*;
public class Sum {

	public static void main(String[] args) {

		int a[] = new int [10];
		Scanner x = new Scanner(System.in);
		
		int n;
		System.out.print("Nhap n: ");
		n = x.nextInt();
		
		int s=0;
		for (int i=0; i<n; i++) {
			System.out.print("Phan tu thu " + i + ": ");
			a[i] = x.nextInt();
			s+= a[i];
		}
		System.out.print("Tong = " + s);
		
	}

}
