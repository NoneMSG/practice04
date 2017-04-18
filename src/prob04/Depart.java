package prob04;

public class Depart extends Employee {
	private String depart;
	
	public Depart(String name, int salray, String depart){
		super(name,salray);
		this.depart=depart;
	}
	public void getInformation() {
		System.out.println( "이름 : " + getName() + " 연봉 : " + getSalary()+" 부서 : "+this.depart );
	}
}
