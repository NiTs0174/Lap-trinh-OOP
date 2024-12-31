package Bai2;
/*-------------------------------------------------------------------------------------*/
import java.util.Scanner;
/*-------------------------------------------------------------------------------------*/
public class DSNguoi2 {
	private int sl;
    private Nguoi2 ds[];
//LIST 
    DSNguoi2(){
        ds = new Nguoi2[100];
        sl =0;
    }
//INPUT    
    void them(Nguoi2 n){
        ds[sl] = n;
        sl++;
    }
//OUTPUT
    void xuatDS(byte loai){
        System.out.println();
        if(loai == 1){
            for(int i=0; i<sl; i++){
                if(ds[i] instanceof HocVien){
                    ds[i].output();
                }
            }
        }
        else if(loai == 2){
            for(int i=0; i<sl; i++){
                if(ds[i] instanceof NhanVien){
                    ds[i].output();
                }
            }
        }
    }
}
