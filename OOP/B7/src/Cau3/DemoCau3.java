package Cau3;

public class DemoCau3 {
	public static void main(String[] args) {
		Nguoi n = new Nguoi("A",1999);
		HocVien hv = new HocVien("B",2000,5,6,7);
		PBKhoa pbk = new PBKhoa();
		NhanVien nv = new NhanVien("C",1990,15000.0,"15/9");
		NhanVienCLC clc = new NhanVienCLC("D",1992,16000.0,"16/9","Dai hoc","CNTT","Hutech");
		NVQuanLy ql = new NVQuanLy("F",1992,16000.0,"16/9","Dai hoc","TMDT","Quoc Gia",1200.0);
		GiaoVien gv = new GiaoVien("E",1993,17000.0,"17/9","Dai hoc","CNTT","SPKT",1500.0);
		n.output();
		hv.output();
		nv.output();
		clc.output();
		ql.output();		
		gv.output();
	}
}
