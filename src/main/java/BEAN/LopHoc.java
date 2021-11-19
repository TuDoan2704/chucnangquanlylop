package BEAN;

public class LopHoc {

	private String id;
	private String tenlop;
	
	LopHoc(){}
	
	public LopHoc(String id, String tenlop) {
		super();
		this.id = id;
		this.tenlop = tenlop;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

}
