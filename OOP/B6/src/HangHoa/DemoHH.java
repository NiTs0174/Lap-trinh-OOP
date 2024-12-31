package HangHoa;

import java.util.Scanner;

public class DemoHH {
	public static void main(String[] args) {
		byte loai;
		Scanner x = new Scanner(System.in);
		System.out.print("Loai HH: ");
		loai = x.nextByte();
		DSHangHoa hh1 = new DSHangHoa();
		hh1.xuatDSTheoLoai(loai);
	}
}
