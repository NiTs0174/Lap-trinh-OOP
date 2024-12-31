import java.util.Scanner;
public class SanPham {
	//Khai bao du lieu
	private String masp,tensp;
	private float gia;
	
	//Phuong thuc khoi tao
	//DN cac phuong thuc
	public String getMaSP() {
		return masp;
	}
	public void setMaSP(String msp) {
		masp = msp;
	}
	public String getTenSP() {
		return tensp;
	}
	public void setTenSP(String tsp) {
		tensp = tsp;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float g) {
		gia = g;
	}
	//Input
	public void input( ) {
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap Ma san pham: ");
		masp = x.nextLine();
		System.out.print("Nhap Ten san pham: ");
		tensp = x.nextLine();
		System.out.print("Nhap Gia: ");
		gia = x.nextFloat();
	}
	//Output
	public void output() {
		System.out.print("\nMa so: " + masp + "|| Ho ten: " + tensp + "|| DTB: " + gia);
	}
}