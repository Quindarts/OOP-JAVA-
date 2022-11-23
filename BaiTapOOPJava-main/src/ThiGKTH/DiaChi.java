package m20_LeMinhQuang;

public class DiaChi {
	private String soNha;
	private String duong;
	private String phuong;
	private String quan;
	
	/**
	 * @param soNha
	 * @param duong
	 * @param phuong
	 * @param quan
	 */
	public DiaChi(String soNha, String duong, String phuong, String quan) {
		setSoNha(soNha);
		setDuong(duong);
		setPhuong(phuong);
		setQuan(quan);
	}
	/**
	 * Constructor khong tham so
	 */
	public DiaChi() {
		this("xxx","xxx","xxx","xxx");
	}
	public String getSoNha() {
		return soNha;
	}
	/**
	 * @param soNha
	 */
	public void setSoNha(String soNha) {
		if(!soNha.trim().equals(""))
		this.soNha = soNha;
		else 
			this.soNha ="xxx";
	}
	public String getDuong() {
		return duong;
	}
	/**
	 * @param duong
	 */
	public void setDuong(String duong) {
		if(!duong.trim().equals(""))
		this.duong = duong;
		else
			this.duong ="xxx";
	}
	public String getPhuong() {
		return phuong;
	}
	/**
	 * @param phuong
	 */
	public void setPhuong(String phuong) {
		if(!phuong.trim().equals(""))
		this.phuong = phuong;
		else
			this.phuong = "xxx";
	}
	public String getQuan() {
		return quan;
	}
	/**
	 * @param quan
	 */
	public void setQuan(String quan) {
		if(!quan.trim().equals(""))
		this.quan = quan;
		else
			this.quan = "xxx";
	}
	
	@Override
	public String toString() {
		
		return String.format("%5s %5s,%5s,%5s ", soNha, duong, phuong, quan);
	}
	
	
}
