package Cau2;
/*-------------------------------------------------------------------------------------*/
abstract class NhanVien{
	private String manv, tennv, trinhdo;
	private int ns;
	static double luongcb;
//CONSTRUCTOR	
	NhanVien(){
		manv = null; tennv = null; trinhdo = null; ns = 0; luongcb = 0.0;
	}
	NhanVien(String manv, String tennv, int ns, String trinhdo){
		this.manv = manv; this.tennv = tennv; this.ns = ns; this.trinhdo = trinhdo;
	}
//OUTPUT
	void output() {
		System.out.print(manv + "\t" + tennv + "\t" + ns + "\t" + trinhdo + "\t" + luongcb);
	}
	abstract double luongNV();
}
/*-------------------------------------------------------------------------------------*/
