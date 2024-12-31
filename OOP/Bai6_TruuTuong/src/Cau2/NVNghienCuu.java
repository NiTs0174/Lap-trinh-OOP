package Cau2;

public class NVNghienCuu extends NVChatLuongCao{
	private double phucapdochai;
	//CONSTRUCTOR	
		NVNghienCuu(){
			super();
		}
		NVNghienCuu(String manv, String tennv, int ns, String trinhdo,String truongdaotao, String chuyenmon, double phucapdochai){
			super(manv,tennv,ns,trinhdo,truongdaotao,chuyenmon);
			this.phucapdochai = phucapdochai;
		}
	//OUTPUT
		void output() {
			super.output();
			System.out.print("\t" + phucapdochai + "\t");
			System.out.println(this.luongNV());
		}
	double luongNV() {
		return luongcb + phucapdochai;
	}
}
