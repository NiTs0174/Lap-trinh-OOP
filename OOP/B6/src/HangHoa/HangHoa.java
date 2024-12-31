package HangHoa;

public class HangHoa {
	private int mahang;
	private String tenhang,nhasx;
	private double gia;
	
	//CONSTRUCTOR
	HangHoa(){
		mahang = 0; tenhang = null; nhasx = null; gia = 0.0;}
	HangHoa(int mahang, String tenhang, String nhasx, double gia){
		this.mahang = mahang; this.tenhang = tenhang; this.nhasx = nhasx; this.gia = gia;}
	
	void output() {
		System.out.print("\n" + mahang + "\t" + tenhang + "\t" + nhasx + "\t" + gia);}
}

class DienMay extends HangHoa{
	private float thoigianbh;
	private double dienap, congsuat;
	
	//CONSTRUCTOR
	DienMay(){
		super();
		thoigianbh = 0.0f;	dienap = 0.0; congsuat = 0.0;
	}
	DienMay(int mahang, String tenhang, String nhasx, double gia, float thoigianbh, double dienap, double congsuat){
		super(mahang,tenhang,nhasx,gia);
		this.thoigianbh = thoigianbh; this.dienap = dienap; this.congsuat = congsuat;
	}
	
	void output() {
		super.output();
		System.out.print("\t" + thoigianbh + "\t" + dienap + "\t" + congsuat);
	}
}

class SanhSu extends HangHoa{
	private String loainguyenlieu;
	
	//CONSTRUCTOR
	SanhSu(){
		super();
		loainguyenlieu = null;
	}
	SanhSu(int mahang, String tenhang, String nhasx, double gia, String loainguyenlieu){
		super(mahang,tenhang,nhasx,gia);
		this.loainguyenlieu = loainguyenlieu;
	}
	
	void output() {
		super.output();
		System.out.print("\t" + loainguyenlieu);
	}
}

class ThucPham extends HangHoa{
	private float ngaysx, ngayhethan;
	
	//CONSTRUCTOR
	ThucPham(){
		super();
		ngaysx = 0.0f;	ngayhethan = 0.0f;
	}
	ThucPham(int mahang, String tenhang, String nhasx, double gia, float ngaysx, float ngayhethan){
		super(mahang,tenhang,nhasx,gia);
		this.ngaysx = ngaysx;
		this.ngayhethan = ngayhethan;
	}
	
	void output() {
		super.output();
		System.out.print("\t" + ngaysx + "\t" + ngayhethan);
	}
}

//class Demo{
//	public static void main(String[] args) {
//		HangHoa hh = new HangHoa(111,"Keyboard","Logitech",799.9);
//		DienMay dm = new DienMay(222,"Keyboard","Logitech",799.9,1,200.0,2.0);
//		SanhSu ss = new SanhSu(333,"Chai Nuoc","Aquafina",20.0,"glastic");
//		ThucPham tp = new ThucPham(444,"Banh mi","street food",15.9,6,18);
//		hh.output();
//		dm.output();
//		ss.output();
//		tp.output();
//	}
//}