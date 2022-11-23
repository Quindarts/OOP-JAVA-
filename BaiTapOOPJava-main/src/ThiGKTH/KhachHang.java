package m20_LeMinhQuang;

public class KhachHang {
	private String hoten;
	private DiaChi diaChi;
	private boolean phaiNam ;
	
	/**
	 * @param hoten
	 * @param diaChi
	 * @param phaiNam
	 */
	public KhachHang(String hoten, DiaChi diaChi, boolean phaiNam) {
		setHoten(hoten);
		setDiaChi(diaChi);
		setPhaiNam(phaiNam);
	}

	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten
	 */
	public void setHoten(String hoten) {
		if(!hoten.trim().equals(""))
		this.hoten = hoten;
		else 
			this.hoten ="xxx";
	}
	public DiaChi getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi
	 */
	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isPhaiNam() {
		return phaiNam;
	}
	/**
	 * @param phaiNam
	 */
	public void setPhaiNam(boolean phaiNam) {
		if(phaiNam == true)
		this.phaiNam = phaiNam;
		else 
			this.phaiNam = false;
	}
	@Override
	public String toString() {
		String phai = isPhaiNam() ? "Mr" : "Mrs";
		return String.format("%s.%s (%s)", phai,hoten,diaChi);
	}
	
}
