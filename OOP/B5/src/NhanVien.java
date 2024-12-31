import java.util.*;
public class NhanVien {
	
	private int maso;
	private String hoten;
	private static double luongcb;
	private double hsluong;
	private static int count = 0;
	
	//get/set
	int getMaSo() {
		return this.maso;
	}
	void setMaSo(int maso) {
		this.maso = maso;
	}
	String getHoTen() {
		return this.hoten;
	}
	void setHoTen(String hoten) {
		this.hoten = hoten;
	}
	double getLuongCB() {
		return this.luongcb;
	}
	void setLuongCB(double luongcb) {
		this.luongcb = luongcb;
	}
	double getHSLuong() {
		return this.hsluong;
	}
	void setHSLuong(double hsluong) {
		this.hsluong = hsluong;
	}
	int getCount() {
		return this.count;
	}
	void setCount(int count) {
		this.count = count;
	}
	
	//Constructor
	NhanVien(){
		maso=0; hoten = null; luongcb=hsluong=0.0; count++; 
	}
	NhanVien(int maso, String hoten, double hsluong){
		this.maso=maso; this.hoten = hoten; this.hsluong = hsluong; count++; 
	}
	NhanVien(NhanVien a){
		maso=a.maso; hoten = a.hoten; hsluong=a.hsluong; count++; 
	}
	
	//Input
	void input() {
		Scanner x = new Scanner(System.in);
		System.out.print("\nMa so: ");
		maso = x.nextInt();
		x.nextLine();
		System.out.print("Ho ten: ");
		hoten = x.nextLine();
		System.out.print("Luong co ban: ");
		luongcb = x.nextDouble();
		System.out.print("He so luong: ");
		hsluong = x.nextDouble();
	}
	
	//Output
	void output() {
		System.out.print("\nMa so: "+maso+" || Ho ten: "+hoten+ " || Luong CB: "+luongcb+" || HS luong: "+hsluong+" || SLNV: "+count);
	}
	
	//Tinh luong
	double TinhLuong() {
		return this.hsluong*this.hsluong;
	}
	
	//Dem so luong nhan vien
	public static void in_SLNV() {
		System.out.print("So luong nhan vien: " + count);
	}
	
}
