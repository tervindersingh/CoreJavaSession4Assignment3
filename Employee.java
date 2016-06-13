import java.io.*;
public class Employee
{
	private int empId;
	private String empName,empAdd;
	private float empSal;
	public void setEmpId(int id)
	{
		empId=id;
	}
	public void setEmpName(String name)
	{
		empName=name;
	}
	public void setEmpAdd(String add)
	{
		empAdd=add;
	}
	public void setEmpSal(float sal)
	{
		empSal=sal;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public String getEmpAdd()
	{
		return empAdd;
	}
	public float getEmpSal()
	{
		return empSal;
	}
			

	public static void main(String args[]) throws Exception
	{	
		int id;
		String name,add,str;
		float sal;
		Employee Emp=new Employee();
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter emp id :");
		str=br.readLine();
		id=Integer.parseInt(str);
		Emp.setEmpId(id);
		System.out.println("Enter Employee Name");
		name=br.readLine();
		Emp.setEmpName(name);
		System.out.println("Enter Employee address");
		add=br.readLine();
		Emp.setEmpAdd(add);
		System.out.println("Enter Employee Salary:");
		str=br.readLine();
		sal=Float.parseFloat(str);	
		Emp.setEmpSal(sal);
		
		}catch (IOException e)
		{	e.printStackTrace();
		}			
		id=Emp.getEmpId();
		name=Emp.getEmpName();
		add=Emp.getEmpAdd();
		sal=Emp.getEmpSal();
		System.out.println("****Employee Details****");
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Address: "+add);
		System.out.println("Employee Salary: "+sal);
	
	}
}