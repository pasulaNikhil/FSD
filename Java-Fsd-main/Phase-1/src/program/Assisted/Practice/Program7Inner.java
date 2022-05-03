package program.Assisted.Practice;

public class Program7Inner 
          {

			 private String msg="Welcome to Java"; 
			 
			 class Inner
			 {  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) 
			{

				Program7Inner obj=new Program7Inner();
				Program7Inner.Inner in=obj.new Inner();  
				in.hello();  
			}
		}


		class Program7Inner2{

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			Program7Inner2 ob=new Program7Inner2();  
			ob.display();  
			}
		}


		//anonymous inner class
		abstract class AnonymousInnerClass {
			   public abstract void display();
			}


			 class Program7Inner3{

			public static void main(String[] args) {
			AnonymousInnerClass i = new AnonymousInnerClass() {

			         public void display() {
			            System.out.println("Anonymous inner Class");
			         }
			      };
			      i.display();
			   }

	}
