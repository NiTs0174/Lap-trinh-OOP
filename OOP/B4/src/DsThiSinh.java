import java.util.Scanner;

public class DsThiSinh() {
	int n;
	ThiSinh a[];
	void Input() {
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap sl: ");
		n=x.nextInt();
		
		a=new ThiSinh[n];
		for(int i=0; i<n; i++) {
			a[i]= new ThiSinh();
			a[i] = Input();
		}
	}
	
	void Output() {
		for(int i=0; i<n; i++) {
			a[i].Output();
			System.out.println();
		}
	}
//	void SxTang() {
//		for(int i=0 ; i<n;i++)	{
//			for(int j=1; j<n-1; j++) {
//				if(a[i].Result()<a[j].Result()) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//	}
}