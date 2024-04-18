package basicsofjava_batch39;

class EmployeeDetails
{
	private int empid = 10;
	private String empun = "info@gmail.com";
	private String emppwd = "Abs@123";
	private int emppin = 0007;
	
	public int getId()
	{
		return empid;
	}
	
	public void setId(int empid)
	{
		this.empid = empid;
	}
	
	public String getEmpUn()
	{
		return empun;
	}
	
	public void setEmpUn(String empun)
	{
		this.empun = empun ;
		
	}
	
	public String getEmpPwd()
	{
		return emppwd;
	}
	
	public void setEmpPwd(String emppwd)
	{
		this.emppwd = emppwd;
	}
	
	public int getEmpPin()
	{
		return emppin;
	}
	
	public void setEmpPin(int emppin)
	{
		this.emppin = emppin;
	}
}	
public class EncapsulationProgram
{

	public static void main(String[] args) 
	{
		EmployeeDetails ed = new EmployeeDetails();
		ed.setId(111);
		System.out.println(ed.getId());
		ed.setEmpUn("empinfo@gmail.com");
		System.out.println(ed.getEmpUn());
		ed.setEmpPwd("111@123");
		System.out.println(ed.getEmpPwd());
		ed.setEmpPin(1010);
		System.out.println(ed.getEmpPin());

	}

}
