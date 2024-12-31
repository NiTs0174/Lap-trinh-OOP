package Bai1;
/*-------------------------------------------------------------------------------------*/
import java.util.*;
/*-------------------------------------------------------------------------------------*/
public class Nguoi {
	private String hoten;
	private int ns;
//CONSTRUCTOR	
	Nguoi(){
		hoten = null; ns = 0;
	}
	Nguoi(String hoten, int ns){
		this.hoten = hoten; this.ns = ns;
	}
//INPUT
	void input() {
		Scanner x = new Scanner(System.in);
		System.out.println("Ho ten: ");	hoten = x.nextLine();
		System.out.println("Nam sinh: ");	ns = x.nextInt();
	}
//OUTPUT
	void output() {
		System.out.print(hoten + "\t" + ns);
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
	HocVien(String hoten, int ns, double d1, double d2, double d3){
		super(hoten,ns);
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
}/*-------------------------------------------------------------------------------------*/
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
		System.out.print(maPBK + "\t" + tenPBK);
	}
}
/*-------------------------------------------------------------------------------------*/
class NhanVien extends Nguoi{
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