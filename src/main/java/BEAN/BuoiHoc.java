package BEAN;

public class BuoiHoc {
	
	private String id;
	private String tenbuoihoc;
	
	public BuoiHoc() {
		
	}
	
	public BuoiHoc(String id, String tenbuoihoc) {
		super();
		this.id = id;
		this.tenbuoihoc = tenbuoihoc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenbuoihoc() {
		return tenbuoihoc;
	}

	public void setTenbuoihoc(String tenbuoihoc) {
		this.tenbuoihoc = tenbuoihoc;
	}
	
}
