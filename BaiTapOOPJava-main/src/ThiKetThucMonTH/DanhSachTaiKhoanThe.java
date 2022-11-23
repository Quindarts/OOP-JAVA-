package M20_21089141_LeMinhQuang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachTaiKhoanThe {
	private ArrayList<TaiKhoanThe> ds;
	private int count;
	public static String getTieuDe() {
		return String.format("%10s %10s %10s %10s %10s\n","Ten TK","Ma The","Han Muc","Tong/SoDu ","Con Kha nang Chi Tieu");
	}
	public DanhSachTaiKhoanThe() {
		ds = new ArrayList<TaiKhoanThe>();
	}
	/**
	 * @param tk
	 * themTaiKhoan
	 */
	public boolean themTaiKhoan(TaiKhoanThe tk) {
		if(ds.contains(tk))
		return false;
		ds.add(tk);
		count++;
		return true;
		
	}
	/**
	 *  xuatToanBoDanhSach
	 */
	public String xuatToanBoDanhSach() {
		String  s= getTieuDe();
		for(TaiKhoanThe tks : ds) {
			s += tks + "\n";
		}
		return s;
	}
	/**
	 * @return SoluongKChiTieu
	 */
	public int SoluongKChiTieu() {
		int dem = 0;
		for(TaiKhoanThe tks : ds) {
			if(!tks.conKhaNangChiTieu())
				dem++;
		}
		return dem;
	}
	public boolean suaHanMuc(String ma, double suahm) {
		for(TaiKhoanThe tks : ds) {
			if(tks instanceof TheTinDung ) {
				if(!tks.getMaThe().equalsIgnoreCase(ma))
				((TheTinDung) tks).setHanMucTinDung(suahm);
				return true;
			}
		}
		return false;
	}
	/**
	 * sapXepGiamDanMa
	 */
	public void sapXepGiamDanMa() {
		Collections.sort(ds, new Comparator<TaiKhoanThe>() {

			@Override
			public int compare(TaiKhoanThe o1, TaiKhoanThe o2) {
				// TODO Auto-generated method stub
				if(o1.getMaThe().compareToIgnoreCase(o2.getMaThe()) !=0)
				 return -1;
				else if(o1.getMaThe().compareToIgnoreCase(o2.getMaThe()) <0)
					return 1;
				return 0;
			}
		});
	}
}
