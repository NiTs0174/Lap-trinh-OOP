public class Demo5 {

	public static void main(String[] args) {
		NhanVien.luongcb = 2000.0;
		NhanVien n1 = new NhanVien();
		n1.output();
		NhanVien n2 = new NhanVien(111,"Nguyen Minh Thang",2.5);
		n2.output();
		NhanVien n3 = new NhanVien(n2);
		n3.output();
		NhanVien n4 = new NhanVien();
		n4.input();
		n4.output();
		//in_SLNV();
		
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
		
//		//Nhap them 1 hoc sinh && Xuat hoc sinh co diem cao hon
//		HocSinh h2 = new HocSinh();
//		//input
//		System.out.print("\nNhap thong tin hoc sinh: ");
//		h2.input();
//		//output
//		if(h1.getDTB() < h2.getDTB()) {
//			System.out.print("\nHo ten hs: " + h2.getHoTen());
//		}
//		else {
//			System.out.print("\nHo ten hs: " + h1.getHoTen());
//		}
	}

}
