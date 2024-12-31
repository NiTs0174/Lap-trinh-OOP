import java.util.*;
public class HocSinh {
	//Khai bao du lieu
	private String maso,hoten;
	private float dtb;
	
	//Phuong thuc khoi tao
	//DN cac phuong thuc
	public String getMaSo() {
		return maso;
	}
	public void setMaSo(String ms) {
		maso = ms;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setHoTen(String ht) {
		hoten = ht;
	}
	public float getDTB() {
		return dtb;
	}
	public void setDTB(float d) {
		dtb = d;
	}
	//Input
	public void input( ) {
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap Ma so: ");
		maso = x.nextLine();
		System.out.print("Nhap Ho ten: ");
		hoten = x.nextLine();
		System.out.print("Nhap Diem trung binh: ");
		dtb = x.nextFloat();
	}
	//Output
	public void output() {
		System.out.print("\nMa so: " + maso + "|| Ho ten: " + hoten + "|| DTB: " + dtb);
	}
}