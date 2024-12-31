public class Demo2 {

	public static void main(String[] args) {

		//Tao 1 doi tuong
		SanPham s1 = new SanPham();
		System.out.print("Du lieu ban dau: ");
		s1.output();
		//input
		System.out.print("\nNhap thong tin san pham: ");
		s1.input();
		//output
		System.out.print("\nDu lieu vua nhap: ");
		s1.output();
		
		//Doi ten hs duoc nhap tu ban phim
//		String tsp;
//		Scanner x = new Scanner(System.in);	
//		x.nextLine();	//nhu fflush trong c
//		System.out.print("\nNhap ten moi cho san pham: ");
//		tsp = x.nextLine();
		//Doi ten doi tuong
//		s1.setHoTen(tsp);
//		System.out.print("\nThong tin vua thay doi: ");
//		s1.output();
		
		//Nhap them 1 hoc sinh && Xuat hoc sinh co diem cao hon
		SanPham s2 = new SanPham();
		//input
		System.out.print("\nNhap thong tin san pham: ");
		s2.input();
		//output
		if(s1.getGia() < s2.getGia()) {
			System.out.print("\nTen sp: " + s2.getTenSP());
		}
		else {
			System.out.print("\nTen sp: " + s1.getTenSP());
		}
		
	}

}
