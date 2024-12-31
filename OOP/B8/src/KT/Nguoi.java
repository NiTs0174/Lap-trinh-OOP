package Cau1;

import java.util.*;
/*-------------------------------------------------------------------------------------*/
class Nguoi{
	private String maso, ten;
	private int ns;
//CONSTRUCTOR	
	Nguoi(){
		maso = null; ten = null; ns = 0;
	}
	Nguoi(String maso, String ten, int ns){
		this.maso = maso; this.ten = ten; this.ns = ns;
	}
//INPUT
	void input() {
		Scanner x = new Scanner(System.in);
		System.out.print("Ma so: ");	maso = x.nextLine();
		System.out.print("Ho ten: ");	ten = x.nextLine();
		System.out.print("Nam sinh: ");	ns = x.nextInt();
		
	}
//OUTPUT
	void output() {
		System.out.println(maso + "\t" + ten + "\t" + ns);
	}
}
/*-------------------------------------------------------------------------------------*/
class SinhVien extends Nguoi{
	private double diem;
//CONSTRUCTOR	
	SinhVien(){
		super();
		diem = 0.0;
	}
	SinhVien(String maso, String ten, int ns, double diem){
		super(maso,ten,ns);
		this.diem = diem;
	}
//INPUT
    void input() {
    	super.input();
    	
    }
//OUTPUT
	void output() {
		super.output();
		System.out.println("\t" + diem);
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
		System.out.print("\t" + luong + "\t" + ngaynhanviec + "\t");
		System.out.print("Phong ban khoa: ");
		for(int i=0; i<pbk.length; i++) {
			System.out.print(this.pbk);
		}
	}
}
