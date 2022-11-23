package M20_21089141_LeMinhQuang;

public class TheTinDung extends TaiKhoanThe{
	private double hanMucTinDung;
	private double tongChiTieu;
	


	/**
	 * @param maThe
	 * @param tenTK
	 * @param hanMucTinDung
	 * @param tongChiTieu
	 */
	public TheTinDung(String maThe, String tenTK, double hanMucTinDung, double tongChiTieu) {
		super(maThe, tenTK);
		// TODO Auto-generated constructor stub
		setHanMucTinDung(hanMucTinDung);
		setTongChiTieu(tongChiTieu);
	}

	public double getHanMucTinDung() {
		return hanMucTinDung;
	}

	/**
	 * @param hanMucTinDung
	 */
	public void setHanMucTinDung(double hanMucTinDung) {
		if(hanMucTinDung >0)
		this.hanMucTinDung = hanMucTinDung;
		else
			this.hanMucTinDung = 0;
	}

	public double getTongChiTieu() {
		return tongChiTieu;
	}

	/**
	 * @param tongChiTieu
	 */
	public void setTongChiTieu(double tongChiTieu) {
		if(tongChiTieu > 0)
		this.tongChiTieu = tongChiTieu;
		else
			this.tongChiTieu = 0;
	}

	@Override
	public boolean conKhaNangChiTieu() {
		// TODO Auto-generated method stub
		return (tongChiTieu <= hanMucTinDung);
	}

	@Override
	public String toString() {
		String chkKhaNang = conKhaNangChiTieu() ? "Co" : "Khong";
		
		return super.toString() + String.format("%10s %10s %10s ", hanMucTinDung, tongChiTieu,chkKhaNang) ;
	}

}
