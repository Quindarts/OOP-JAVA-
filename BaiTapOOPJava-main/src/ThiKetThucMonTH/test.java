package M20_21089141_LeMinhQuang;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachTaiKhoanThe ds = new DanhSachTaiKhoanThe();
		//Them Danh Sach
		ds.themTaiKhoan(new TheTinDung("ABC", "D11111", 300000, 400000));
		ds.themTaiKhoan(new TheTinDung("ABC", "L55555", 300000, 400000));
		ds.themTaiKhoan(new TheGhiNo("CDE", "E66666", 400000));
		ds.themTaiKhoan(new TheGhiNo("CDE", "F77777", 400000));
		ds.themTaiKhoan(new TheGhiNo("CDE", "H44444", 600000));
		
		System.out.println("Xuat toan bo danh sach");
		System.out.println(ds.xuatToanBoDanhSach());
		//So Luong the con kha nang chi tieu
		System.out.print("So Luong the khong con kha nang chi tieu: ");
		System.out.println(ds.SoluongKChiTieu());
		//Sua han muc tin dung
		System.out.println("Sua han muc tin dung : ");
		ds.suaHanMuc("D11111",700000);
		System.out.println(ds.xuatToanBoDanhSach());
		//Sap xep danh sach giam dan theo ma
		System.out.println("Sap xep danh sach giam dan theo ma");
		ds.sapXepGiamDanMa();
		System.out.println(ds.xuatToanBoDanhSach());
	}

}
