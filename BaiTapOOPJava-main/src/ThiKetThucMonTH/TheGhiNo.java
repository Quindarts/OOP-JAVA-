package M20_21089141_LeMinhQuang;

public class TheGhiNo extends TaiKhoanThe {
	private double soDu;
	
	public TheGhiNo(String maThe, String tenTK, double soDu) {
		super(maThe, tenTK);
		// TODO Auto-generated constructor stub
		setSoDu(soDu);
	}

	public double getSoDu() {
		return soDu;
	}

	/**
	 * @param soDu
	 */
	public void setSoDu(double soDu) {
		if(soDu > 0)
		this.soDu = soDu;
		else 
			this.soDu = 0;
	}

	@Override
	public boolean conKhaNangChiTieu() {
		// TODO Auto-generated method stub
		return (soDu >=100000);
	}

	@Override
	public String toString() {
		
		String chkKhaNang = conKhaNangChiTieu() ? "Co" : "Khong";
		return super.toString() + String.format("%10s %10s %10s","theghiNo",soDu,chkKhaNang) ;
	}
	
}
