package M20_21089141_LeMinhQuang;

public abstract class TaiKhoanThe {
	protected String maThe;
	protected String tenTK;
	
	
	/**
	 * Contructor
	 */
	public TaiKhoanThe() {
		this("xxxxxxxx","xxxx");
	}
	/**
	 * @param maThe
	 * @param tenTK
	 */
	public TaiKhoanThe(String maThe, String tenTK) {
		setMaThe(maThe);
		setTenTK(tenTK);
	}
	public String getMaThe() {
		return maThe;
	}
	/**
	 * @param maThe
	 */
	public void setMaThe(String maThe) {
		if(!maThe.trim().equals(""))
		this.maThe = maThe;
		else 
			this.maThe = "xxxxxxxxx";
	}
	public String getTenTK() {
		return tenTK;
	}
	/**
	 * @param tenTK
	 */
	public void setTenTK(String tenTK) {
		if(!tenTK.trim().equals(""))
		this.tenTK = tenTK;
		else
			this.tenTK = "xxxx";
	}
	/**
	 * @return conKhaNangChiTieu
	 */
	public abstract boolean conKhaNangChiTieu();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maThe == null) ? 0 : maThe.hashCode());
		result = prime * result + ((tenTK == null) ? 0 : tenTK.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoanThe other = (TaiKhoanThe) obj;
		if (maThe == null) {
			if (other.maThe != null)
				return false;
		} else if (!maThe.equals(other.maThe))
			return false;
		if (tenTK == null) {
			if (other.tenTK != null)
				return false;
		} else if (!tenTK.equals(other.tenTK))
			return false;
		return true;
	}
	@Override
	public String toString() {
		
		return String.format("%10s %10s", maThe, tenTK);
	}
	
	
	
}
