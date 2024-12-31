package Cau3;
/*-------------------------------------------------------------------------------------*/
import java.util.*;
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
		System.out.print(ten + "\t" + ns);
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
		System.out.print("\t" + maPBK + "\t" + tenPBK);
	}
}
/*-------------------------------------------------------------------------------------*/
class NhanVien extends Nguoi{
	private double luong;
	private String ngaynhanviec;
//CONSTRUCTOR	
	NhanVien(){
		super();
		luong = 0.0; ngaynhanviec = null;
	}
	NhanVien(String ten, int ns, double luong, String ngaynhanviec){
		super(ten,ns);
		this.luong = luong; this.ngaynhanviec = ngaynhanviec;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + luong + "\t" + ngaynhanviec);
	}
}
/*-------------------------------------------------------------------------------------*/
class NhanVienCLC extends NhanVien{
	private String trinhdo, nganh, noidaotao;
//CONSTRUCTOR	
	NhanVienCLC(){
		super();
		trinhdo = null; nganh = null; noidaotao = null;
	}
	NhanVienCLC(String ten, int ns, double luong, String ngaynhanviec, String trinhdo, String nganh, String noidaotao){
		super(ten,ns,luong,ngaynhanviec);
		this.trinhdo = trinhdo; this.nganh = nganh; this.noidaotao = noidaotao;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + trinhdo + "\t" + nganh + "\t" + noidaotao);
	}
}
/*-------------------------------------------------------------------------------------*/
class NVQuanLy extends NhanVienCLC{
	private double phucapCV;
//CONSTRUCTOR	
	NVQuanLy(){
		super();
		phucapCV = 0.0;
	}
	NVQuanLy(String ten, int ns, double luong, String ngaynhanviec, String trinhdo, String nganh, String noidaotao, double phucapCV){
		super(ten,ns,luong,ngaynhanviec,trinhdo,nganh,noidaotao);
		this.phucapCV = phucapCV;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + phucapCV);
	}
}
/*-------------------------------------------------------------------------------------*/
class GiaoVien extends NhanVienCLC{
	private double thulaoGD;
//CONSTRUCTOR	
	GiaoVien(){
		super();
		thulaoGD = 0.0;
	}
	GiaoVien(String ten, int ns, double luong, String ngaynhanviec, String trinhdo, String nganh, String noidaotao, double thulaoGD){
		super(ten,ns,luong,ngaynhanviec,trinhdo,nganh,noidaotao);
		this.thulaoGD = thulaoGD;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + thulaoGD);
	}
}







