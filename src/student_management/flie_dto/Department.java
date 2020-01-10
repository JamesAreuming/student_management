package student_management.flie_dto;

public class Department {
	private String deptName;
	private int deptNo;
	private int floor;
	
	public Department() {
		
	}
	
	public Department(String deptName, int deptNo, int floor) {
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.floor = floor;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s", deptName, deptNo, floor);
	}
	
	
	
	
}
