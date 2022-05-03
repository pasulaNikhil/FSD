package program.Assisted.Practice;


		
		public class ProgThreadMech12 extends Thread
		{
		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		 		ProgThreadMech12 mt = new  ProgThreadMech12();
		  		mt.start();
		 	

	}

}
