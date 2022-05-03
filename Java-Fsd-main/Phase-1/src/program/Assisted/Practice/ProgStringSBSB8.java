package program.Assisted.Practice;

public class ProgStringSBSB8 {

	public static void main(String[] args) {
		
		
		String s1="java";    
		System.out.println("String is:" +s1);
		
        
        StringBuffer sbr = new StringBuffer(s1); 
        sbr.reverse(); 
        System.out.println("Conversion of String to StringBuffer");
        System.out.println(sbr); 
          

        StringBuilder sb = new StringBuilder(s1); 
        sb.append("programming"); 
        System.out.println("Conversion of String to StringBuilder");
        System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
