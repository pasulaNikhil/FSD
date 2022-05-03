package program.Assisted.Practice;
class ConstructorDemo 
    {
			int id;
			String name;

		void display() 
		{
			System.out.println(id+" "+name);
		}
	}

public class ProgConstructor5
       {
		public static void main(String[] args) 
		   {

			ConstructorDemo emp1=new ConstructorDemo();
			ConstructorDemo emp2=new ConstructorDemo();

			emp1.display();
			emp2.display();
			}
		}






