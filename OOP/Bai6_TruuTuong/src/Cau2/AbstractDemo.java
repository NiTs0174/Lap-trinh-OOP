package Cau2;

public class AbstractDemo {
	public static void main(String[] args) {
		NhanVien.luongcb = 2000.0;
		//
		NhanVien nv = new NVPhucVu("111","A",1999,"");
		nv.output();
		//System.out.println(nv.luongNV());
		//
		NhanVien nv1 = new NVQuanLy("222","B",2001,"","DH","IT",200.0);		
		nv1.output();
		//System.out.println(nv1.luongNV());
		//
		NhanVien nv2 = new NVNghienCuu("333","C",2003,"","DH","IT",300.0);
		nv2.output();
		//System.out.println(nv2.luongNV());
	}
}
