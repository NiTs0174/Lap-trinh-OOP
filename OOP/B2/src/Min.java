import java.util.Scanner;
public class Min {

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

		int min = a[0];
		for (int i=0; i<n; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.print("Min = " + min);
		
	}

}
