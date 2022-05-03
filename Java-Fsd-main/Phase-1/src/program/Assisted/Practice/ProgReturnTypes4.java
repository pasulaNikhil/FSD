package program.Assisted.Practice;

class Employee {
		
			int EmpId;
			String EmpName;
			double Salary;
			int empIdInf() 
			{
			return EmpId;	
			}
			String empNameInf() 
			{
			return EmpName;	
			}
			double empSalaryInf() 
			{
			return Salary;	
			}
			}

public class ProgReturnTypes4
{

		public static void main(String[] args) 
		{
				
		Employee emp=new Employee();
		emp.EmpId=723456;
		emp.EmpName="joy";
		emp.Salary=10000;
		System.out.println(emp.EmpId);
		System.out.println(emp.EmpName);
		System.out.println(emp.Salary);

	    }

}

