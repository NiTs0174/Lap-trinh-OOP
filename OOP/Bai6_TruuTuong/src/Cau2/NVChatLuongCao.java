package Cau2;
/*-------------------------------------------------------------------------------------*/
abstract class NVChatLuongCao extends NhanVien{
	private String truongdaotao, chuyenmon;
//CONSTRUCTOR
	NVChatLuongCao(){
		this.truongdaotao = null; this.chuyenmon = null;
	}
	NVChatLuongCao(String manv, String tennv, int ns, String trinhdo,String truongdaotao, String chuyenmon){
		super(manv,tennv,ns,trinhdo);
		this.truongdaotao = truongdaotao; this.chuyenmon = chuyenmon;
	}
//OUTPUT
	void output() {
		super.output();
		System.out.print("\t" + truongdaotao + "\t" + chuyenmon);
		
	}
	abstract double luongNV();
}
/*-------------------------------------------------------------------------------------*/
