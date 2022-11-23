package m20_LeMinhQuang;

import java.util.Scanner;

public class test_TaiKhoan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Khoi tao Tai Khoan
		DiaChi diachiA = new DiaChi("194A","Le Duc Tho","phuong 9","Go Vap");
		KhachHang khA= new KhachHang("Nguyen Van A", diachiA, true);
		TaiKhoan TKA = new TaiKhoan(9999, khA, 10000000);
			System.out.println(TKA.toString());
		//Test Ham gui tien	
		System.out.println("Moi nhap so tien muon goi: \n");
			double nhapTien = sc.nextDouble();
		if(TKA.goiTien(nhapTien)) {
			System.out.println("GD GOI TIEN THANH CONG. TK sau khi goi la: ");
			System.out.println(TKA.toString());}
		else
			System.out.println("GOI TIEN KHONG THANH THANH CONG. \n");
		//Test Ham rut tien
		System.out.println("Moi nhap so tien muon rut: ");
			double rutTien = sc.nextDouble();
			
		if(TKA.rutTien(rutTien)) {
			System.out.println("GD RUT TIEN THANH CONG. TK sau khi rut la: ");
			System.out.println(TKA.toString());
		}
		else
			System.out.println("GD RUT TIEN KHONG THANH CONG: So tien rut > So tien trong tai khoan hoac So tien rut < 0.");
	}
	
}
