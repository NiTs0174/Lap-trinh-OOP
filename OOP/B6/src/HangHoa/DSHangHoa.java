package HangHoa;

public class DSHangHoa {
	private int sl;
	private HangHoa ds[];
	
	//CONSTRUCTORS
	DSHangHoa(){
		ds = new HangHoa[100];
		sl = 0;
	}
	//Them 1 hh
	void themMH(HangHoa h) {
		ds[sl] = h;
		sl++;
	}
	//Phan loai: 1:HDM, 2:HDT
	void xuatDSTheoLoai(byte loai) {
		if(loai == 1) {
			for(int i=0; i<sl; i++) {
				if(ds[i] instanceof DienMay) {
					ds[i].output();
				}
			}
		}
		else {
			for(int i=0; i<sl; i++) {
				if(ds[i] instanceof ThucPham) {
					ds[i].output();
				}
			}
		}
	}
	
}
