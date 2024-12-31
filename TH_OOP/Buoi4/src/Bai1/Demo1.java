package Bai1;
/*-------------------------------------------------------------------------------------*/
import java.util.*;
/*-------------------------------------------------------------------------------------*/
public class Demo1 {
	public static void main(String[] args) {
		byte chon;
		Scanner doc = new Scanner(System.in);
		do {
			System.out.print("1. Nhap 1 hoc vien");
			System.out.print("2. Nhap 1 nhan vien");
			System.out.print("3. Xuat thong tin 1 hoc vien");
			System.out.print("4. Xuat thong tin 1 nhan vien");
			System.out.print("5. Thoat.");
			System.out.print("Chon chuc nang: ");
			chon = doc.nextByte();
			switch(chon) {
				case 1:
					HocVien hv = new HocVien();
					hv.input();
					break;
				case 2:
					NhanVien nv = new NhanVien();
					nv.input();
					break;
				case 3:
					hv.output();
					break;
				case 4:
					nv.output();
					break;
				default: chon = 0; break;
			}
		}while(chon != 0);
	}
}
