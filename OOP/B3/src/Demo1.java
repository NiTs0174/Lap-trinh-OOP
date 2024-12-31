import java.util.*;
public class Demo1 {

	public static void main(String[] args) {

		//Tao 1 doi tuong
		HocSinh h1 = new HocSinh();
		System.out.print("Du lieu ban dau: ");
		h1.output();
		//input
		System.out.print("\nNhap thong tin hoc sinh: ");
		h1.input();
		//output
		System.out.print("\nDu lieu vua nhap: ");
		h1.output();
		
		//Doi ten hs duoc nhap tu ban phim
//		String ht;
//		Scanner x = new Scanner(System.in);	
//		x.nextLine();	//nhu fflush trong c
//		System.out.print("\nNhap ho ten moi cho hoc sinh: ");
//		ht = x.nextLine();
		//Doi ten doi tuong
//		h1.setHoTen(ht);
//		System.out.print("\nThong tin vua thay doi: ");
//		h1.output();
		
		//Nhap them 1 hoc sinh && Xuat hoc sinh co diem cao hon
		HocSinh h2 = new HocSinh();
		//input
		System.out.print("\nNhap thong tin hoc sinh: ");
		h2.input();
		//output
		if(h1.getDTB() < h2.getDTB()) {
			System.out.print("\nHo ten hs: " + h2.getHoTen());
		}
		else {
			System.out.print("\nHo ten hs: " + h1.getHoTen());
		}
		
	}

}
