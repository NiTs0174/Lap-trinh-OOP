package Cau2;
/*-------------------------------------------------------------------------------------*/
import java.util.*;
/*-------------------------------------------------------------------------------------*/
class NhanVien{
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
		System.out.println(manv + "\t" + tennv + "\t" + ns + "\t" + trinhdo + "\t" + luongcb);
	}
}
/*-------------------------------------------------------------------------------------*/

class NVPhucVu extends NhanVien {
//CONSTRUCTOR	
	NVPhucVu(){
		super();
	}
	NVPhucVu(String manv, String tennv, int ns, String trinhdo){
		super();
	}
//OUTPUT
	void output() {
		super.output();
	}
}
/*-------------------------------------------------------------------------------------*/
class HocVan{
	private String truongdaotao, chuyenmon;
//CONSTRUCTOR
	HocVan(){
		this.truongdaotao = null; this.chuyenmon = null;
	}
	HocVan(String truongdaotao, String chuyenmon){
		this.truongdaotao = truongdaotao; this.chuyenmon = chuyenmon;
	}
//OUTPUT
	void output2() {
		System.out.print("\t" + truongdaotao + "\t" + chuyenmon);
	}
}
/*-------------------------------------------------------------------------------------*/
class NVQuanLy extends NhanVien{
	private double phucapchucvu;
//CONSTRUCTOR	
	NVQuanLy(){
		super();
	}
	NVQuanLy(String manv, String tennv, int ns, String trinhdo, double phucapchucvu){
		super(manv,tennv,ns,trinhdo);
		this.phucapchucvu = phucapchucvu;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + phucapchucvu);
	}
}
/*-------------------------------------------------------------------------------------*/
class NVNghienCuu extends NhanVien{
	private double phucapdochai;
//CONSTRUCTOR	
	NVNghienCuu(){
		super();
	}
	NVNghienCuu(String manv, String tennv, int ns, String trinhdo, double phucapdochai){
		super(manv,tennv,ns,trinhdo);
		this.phucapdochai = phucapdochai;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + phucapdochai);
	}
}
/*-------------------------------------------------------------------------------------*/

class Demo{
	public static void main(String[] args) {
		NhanVien.luongcb = 1000.0;
		NhanVien nv = new NhanVien("111","Nguyen Van A",2003,"Dai hoc");
		NVPhucVu pv = new NVPhucVu("222","Nguyen Van B",2001,"Dai hoc");
		//HocVan hv = new HocVan("333","Nguyen Van C",2002,"Cao Dang");
		NVQuanLy ql = new NVQuanLy("444","Nguyen Van D",2003,"Dai hoc",30.9);
		NVNghienCuu nc = new NVNghienCuu("555","Nguyen Van E",2002,"Trung hoc",40.6);
		nv.output();
		pv.output();
		//hv.output();
		ql.output();
		nc.output();
	}
}
/*-------------------------------------------------------------------------------------*/
//NhanVien(NhanVien obj){
//	manv = obj.manv; tennv = obj.tennv; trinhdo = obj.trinhdo; chuyenmon = obj.chuyenmon; ns = obj.ns;}
////GET/SET
//String getMaNV() 						{return this.manv;}
//void setMaNV(String maso) 				{this.manv = manv;}
//String getTenNV() 						{return this.tennv;}
//void setTenNV(String tennv) 			{this.tennv = tennv;}
//String getTrinhDo() 					{return this.trinhdo;}
//void setTrinhDo(String trinhdo) 		{this.trinhdo = trinhdo;}
//String getChuyenMon() 					{return this.chuyenmon;}
//void setChuyenMon(String chuyenmon) 	{this.chuyenmon = chuyenmon;}
//double getNS() 							{return this.ns;}
//void setNS(int ns) 						{this.ns = ns;}
//double getLuongCB() 					{return this.luongcb;}
//void setLuongCB(double luongcb) 		{this.luongcb = luongcb;}