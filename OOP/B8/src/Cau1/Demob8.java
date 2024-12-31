package Cau1;
/*-------------------------------------------------------------------------------------*/
class Nguoi{
	private String ten;
	private int ns;
//CONSTRUCTOR	
	Nguoi(){
		ten = null; ns = 0;
	}
	Nguoi(String ten, int ns){
		this.ten = ten; this.ns = ns;
	}
//OUTPUT
	void output() {
		System.out.println(ten + "\t" + ns);
	}
}
/*-------------------------------------------------------------------------------------*/
class HocVien extends Nguoi{
	private double d1,d2,d3;
//CONSTRUCTOR	
	HocVien(){
		super();
		d1 = 0.0; d2 = 0.0; d3 = 0.0;
	}
	HocVien(String ten, int ns, double d1, double d2, double d3){
		super(ten,ns);
		this.d1 = d1; this.d2 = d2; this.d3 = d3;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.println("\t" + d1 + "\t" + d2 + "\t" + d3);
	}
}
/*-------------------------------------------------------------------------------------*/
class PBKhoa{
	private String maPBK,tenPBK;
//CONSTRUCTOR	
	PBKhoa(){
		maPBK = null; tenPBK = null;
	}
	PBKhoa(String maPBK, String tenPBK){
		this.maPBK = maPBK; this.tenPBK = tenPBK;
	}
//OUTPUT
	void output() {
		System.out.println(maPBK + "\t" + tenPBK);
	}
}
/*-------------------------------------------------------------------------------------*/
class NhanVien extends Nguoi{
	private double luong;
	private String ngaynhanviec;
	private PBKhoa pbk[];
//CONSTRUCTOR	
	NhanVien(){
		super();
		luong = 0.0; ngaynhanviec = null;
	}
	NhanVien(String ten, int ns, double luong, String ngaynhanviec, PBKhoa pbk[]){
		super(ten,ns);
		this.luong = luong; this.ngaynhanviec = ngaynhanviec;
		this.pbk = new PBKhoa[pbk.length];
		for(int i=0; i<pbk.length; i++) {
			this.pbk[i] = new PBKhoa();
			this.pbk[i] = pbk[i];
		}
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + luong + "\t" + ngaynhanviec + "\t");
		System.out.print("Phong ban khoa: ");
		for(int i=0; i<pbk.length; i++) {
			System.out.print(this.pbk);
		}
	}
}

/*-------------------------------------------------------------------------------------*/
public class Demob8 {
	public static void main(String[] args) {
		Nguoi n = new Nguoi("A",1999);
		HocVien hv = new HocVien("B",2000,5,6,7);
		PBKhoa pbk[] = {new PBKhoa("K","CNTT"), new PBKhoa("K","CNTT")};
		NhanVien nv = new NhanVien("C",1990,15000.0,"15/9",pbk);
		n.output();
		hv.output();
//		pbk.output();
		nv.output();
	}
}
