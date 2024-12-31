import java.util.*;
public class Max {

	public static void main(String[] args) {
		
		int a[] = new int [10];
		Scanner x = new Scanner(System.in);
		
		int n;
		System.out.print("Nhap n: ");
		n = x.nextInt();

		for (int i=0; i<n; i++) {
			System.out.print("Phan tu thu " + i + ": ");
			a[i] = x.nextInt();
		}
		
		int max = a[0];
		for (int i=0; i<n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.print("Max = " + max);
		
	}

}
