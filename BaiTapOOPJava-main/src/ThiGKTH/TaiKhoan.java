package m20_LeMinhQuang;

import java.text.DecimalFormat;

public class TaiKhoan {
	
	private int soTK;
	private KhachHang khachHang;
	private double sodu = 1000000.0;
	
	/**
	 * @param soTK
	 * @param khachHang
	 * @param sodu
	 */
	public TaiKhoan(int soTK, KhachHang khachHang, double sodu) {
		setSoTK(soTK);
		setKhachHang(khachHang);
		setSodu(sodu);
	}
	public int getSoTK() {
		return soTK;
	}
	/**
	 * @param soTK
	 */
	public void setSoTK(int soTK) {
		if(soTK > 0)
		this.soTK = soTK;
		else
			this.soTK = 0;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	/**
	 * @param khachHang
	 */
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public double getSodu() {
		return sodu;
	}
	/**
	 * @param sodu
	 */
	public void setSodu(double sodu) {
		if(sodu > 100000)
		this.sodu = sodu;
		else
			this.sodu = 100000;
	}
	/**
	 * @param  Gui tien
	 * @return true false
	 */
	public boolean goiTien(double tien) {
		if(tien <= 0)
			return false;
		else {
			sodu= sodu + tien;
			return true;
		}
	}
	/**
	 * @param rut tien
	 * @return true false
	 */
	public boolean rutTien(double ruttien) {
		if((sodu- ruttien) < 100000)
			return false;
		else {
			sodu = sodu - ruttien;
			return true;
		}
	}
	@Override
	public String toString() {
		DecimalFormat dft = new DecimalFormat("##,000");
		return String.format("%s,[SoTK= %d],So du hien tai = %s VND", khachHang.toString(),soTK, dft.format(sodu));
	}
	
	
}
