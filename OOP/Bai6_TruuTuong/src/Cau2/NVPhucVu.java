package Cau2;

public class NVPhucVu extends NhanVien{
	//CONSTRUCTOR	
		NVPhucVu(){
			super();
		}
		NVPhucVu(String manv, String tennv, int ns, String trinhdo){
			super(manv,tennv,ns,trinhdo);
		}
	//OUTPUT
		void output() {
			super.output();
			System.out.println("\t" + this.luongNV());
		}
	double luongNV() {
		return luongcb;
	}
}
