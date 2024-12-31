package Cau2;
/*-------------------------------------------------------------------------------------*/
public class NVQuanLy extends NVChatLuongCao{
	private double phucapchucvu;
	//CONSTRUCTOR	
		NVQuanLy(){
			super();
		}
		NVQuanLy(String manv, String tennv, int ns, String trinhdo,String truongdaotao, String chuyenmon, double phucapchucvu){
			super(manv,tennv,ns,trinhdo,truongdaotao,chuyenmon);
			this.phucapchucvu = phucapchucvu;
		}
	//OUTPUT
		void output() {
			super.output();
			System.out.print("\t" + phucapchucvu + "\t");
			System.out.println(this.luongNV());
		}
	double luongNV() {
		return luongcb + phucapchucvu;
	}
}
/*-------------------------------------------------------------------------------------*/
