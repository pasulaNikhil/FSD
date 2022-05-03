package program.Assisted.Practice;

		 interface First 
		{
			 default void show() 
				    { 
				        System.out.println("Default First"); 
				    } 
		}
			interface Second 
				{  
				    default void show() 
				    { 
				        System.out.println("Default Second"); 
				    } 
				 
				public  class  ProgDiamond20 implements First, Second 
				{  
				    public void show() 
				    {  
				        First.super.show(); 
				        Second.super.show(); 
				    } 
				    public static void main(String args[]) 
				    { 
				    	ProgDiamond20 ob = new ProgDiamond20(); 
				        ob.show(); 
				    } 
				}

}
		