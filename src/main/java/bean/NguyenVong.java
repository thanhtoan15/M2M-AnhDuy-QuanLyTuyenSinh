package bean;

public class NguyenVong {
	private String maNganh;
	private String tenNganh;
	private String maTruong;
	private String khoiXetTuyen;
	private Double diemXetTuyen;
	
	public NguyenVong() {
		super();
	}

	public NguyenVong(String maNganh, String tenNganh, String maTruong, String khoiXetTuyen, Double diemXetTuyen) {
		super();
		this.maNganh = maNganh;
		this.tenNganh = tenNganh;
		this.maTruong = maTruong;
		this.khoiXetTuyen = khoiXetTuyen;
		this.diemXetTuyen = diemXetTuyen;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getKhoiXetTuyen() {
		return khoiXetTuyen;
	}

	public void setKhoiXetTuyen(String khoiXetTuyen) {
		this.khoiXetTuyen = khoiXetTuyen;
	}

	public Double getDiemXetTuyen() {
		return diemXetTuyen;
	}

	public void setDiemXetTuyen(Double diemXetTuyen) {
		this.diemXetTuyen = diemXetTuyen;
	}

	@Override
	public String toString() {
		return "NguyenVong [maNganh=" + maNganh + ", tenNganh=" + tenNganh + ", maTruong=" + maTruong
				+ ", khoiXetTuyen=" + khoiXetTuyen + ", diemXetTuyen=" + diemXetTuyen + "]";
	}
}
