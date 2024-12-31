package Bai2;
/*-------------------------------------------------------------------------------------*/
import java.util.*;
/*-------------------------------------------------------------------------------------*/
class Nguoi2{
	private String ten;
	private int ns;
//CONSTRUCTOR	
	Nguoi2(){
		ten = null; ns = 0;
	}
	Nguoi2(String ten, int ns){
		this.ten = ten; this.ns = ns;
	}
//INPUT
	void input() {
		Scanner x = new Scanner(System.in);
		System.out.println("Ho ten: ");	ten = x.nextLine();
		System.out.println("Nam sinh: ");	ns = x.nextInt();
	}
//OUTPUT
	void output() {
		System.out.print(ten + "\t" + ns);
	}
}
/*-------------------------------------------------------------------------------------*/
class HocVien extends Nguoi2{
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
//INPUT
	void input() {
		super.input();
		Scanner x = new Scanner(System.in);
		System.out.println("Diem 1: ");	d1 = x.nextDouble();
		System.out.println("Diem 2: ");	d2 = x.nextDouble();
		System.out.println("Diem 3: ");	d3 = x.nextDouble();
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
//INPUT
	void input() {
		Scanner x = new Scanner(System.in);
		System.out.println("Ma PBK: ");		x.nextLine();	maPBK = x.nextLine();
		System.out.println("Ten PBK: ");	x.nextLine();	tenPBK = x.nextLine();
	}
//OUTPUT
	void output() {
		System.out.print("\t" + maPBK + "\t" + tenPBK);
	}
}
/*-------------------------------------------------------------------------------------*/
class NhanVien extends Nguoi2{
	private double luong;
	private String ngaynhanviec;
	PBKhoa pbk;
//CONSTRUCTOR	
	NhanVien(){
		super();
		luong = 0.0; ngaynhanviec = null;
	}
	NhanVien(String hoten, int ns, double luong, String ngaynhanviec, PBKhoa pbk){
		super(hoten,ns);
		this.luong = luong; this.ngaynhanviec = ngaynhanviec;
		pbk = new PBKhoa("IT01","CNTT");
	}
//INPUT
	void input() {
		super.input();
		Scanner x = new Scanner(System.in);
		System.out.println("Luong: ");							luong = x.nextDouble();
		System.out.println("Ngay nhan viec: ");	x.nextLine();	ngaynhanviec = x.nextLine();
		pbk.input();
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + luong + "\t" + ngaynhanviec + "\t" + pbk);
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
	NhanVienCLC(String ten, int ns, double luong, String ngaynhanviec, PBKhoa pbk, String trinhdo, String nganh, String noidaotao){
		super(ten,ns,luong,ngaynhanviec,pbk);
		this.trinhdo = trinhdo; this.nganh = nganh; this.noidaotao = noidaotao;
	}
//INPUT
	void input() {
		super.input();
		Scanner x = new Scanner(System.in);
		System.out.println("Trinh do: ");		x.nextLine();	trinhdo = x.nextLine();
		System.out.println("Nganh: ");			x.nextLine();	nganh = x.nextLine();
		System.out.println("Noi dao tao: ");	x.nextLine();	noidaotao = x.nextLine();
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
	NVQuanLy(String ten, int ns, double luong, String ngaynhanviec, PBKhoa pbk, String trinhdo, String nganh, String noidaotao, double phucapCV){
		super(ten,ns,luong,ngaynhanviec,pbk,trinhdo,nganh,noidaotao);
		this.phucapCV = phucapCV;
	}
//INPUT
	void input() {
		super.input();
		Scanner x = new Scanner(System.in);
		System.out.println("Phu cap cong viec: ");	phucapCV = x.nextDouble();
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
	GiaoVien(String ten, int ns, double luong, String ngaynhanviec, PBKhoa pbk, String trinhdo, String nganh, String noidaotao, double thulaoGD){
		super(ten,ns,luong,ngaynhanviec,pbk,trinhdo,nganh,noidaotao);
		this.thulaoGD = thulaoGD;
	}
//INPUT
	void input() {
		super.input();
		Scanner x = new Scanner(System.in);
		System.out.println("Thu lao GD: ");	thulaoGD = x.nextDouble();
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + thulaoGD);
	}
}







