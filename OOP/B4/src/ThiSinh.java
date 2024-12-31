import java.util.*;

public class ThiSinh{
	//Khai bao du lieu
	private String maso,hoten;
	private float dnghe,dnoi,ddoc,dviet;
	
	//Phuong thuc khoi tao
	//DN cac phuong thuc
	public String getMaSo() {
		return this.maso;
	}
	public void setMaSo(String maso) {
		this.maso = maso;
	}
	public String getHoTen() {
		return hoten;
	}
	public void setHoTen(String ht) {
		hoten = ht;
	}
	public float getDNghe() {
		return this.dnghe;
	}
	public void setDNghe(float dnghe) {
		this.dnghe = dnghe;
	}
	public float getDNoi() {
		return this.dnoi;
	}
	public void setDNoi(float dnoi) {
		this.dnoi = dnoi;
	}
	public float getDDoc() {
		return this.ddoc;
	}
	public void setDDoc(float ddoc) {
		this.ddoc = ddoc;
	}
	public float getDViet() {
		return this.dviet;
	}
	public void setDViet(float dviet) {
		this.dviet = dviet;
	}
	//Input
	public void input( ) {
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap Ma so: ");
		maso = x.nextLine();
		System.out.print("Nhap Ho ten: ");
		hoten = x.nextLine();
		System.out.print("Nhap Diem nghe: ");
		dnghe = x.nextFloat();
		System.out.print("Nhap Diem noi: ");
		dnoi = x.nextFloat();
		System.out.print("Nhap Diem Doc: ");
		ddoc = x.nextFloat();
		System.out.print("Nhap Diem VIet: ");
		dviet = x.nextFloat();
	}
	//Output
	public void output() {
		System.out.print(maso + "\t" + hoten + "\t" +dnghe+"\t"+dnoi+"\t"+ddoc+"\t"+dviet);
		this.GPA();
	}
	double Result() {
		double avg;
		avg = (dnghe+dnoi+ddoc+dviet)/4;
	}
	void GPA() {
		if(this.Result()<5)
			System.out.print("Han che");
		else if(this.Result()<8)
			System.out.print("Tot");
		else
			System.out.print("Thong thao");
	}
}
