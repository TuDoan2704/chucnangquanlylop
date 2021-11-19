package BEAN;

public class GiaoVien {
	
	private String id;
	private String tenGiaoVien;
	
	public GiaoVien() {
		
	}
	
	public GiaoVien(String id, String tenGiaoVien) {
		super();
		this.id = id;
		this.tenGiaoVien = tenGiaoVien;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenGiaoVien() {
		return tenGiaoVien;
	}

	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}
	
}
