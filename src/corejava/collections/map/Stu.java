package corejava.collections.map;

public class Stu {
	int stuId;
	String stuName;
	String stuAdress;
	public Stu(int stuId, String stuName, String stuAdress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdress = stuAdress;
	}
	@Override
	public String toString() {
		return "Stu [stuId=" + stuId + ", stuName=" + stuName + ", stuAdress=" + stuAdress + "]";
	}
	
	
}
