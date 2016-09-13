package wrapperclass;

public class Main1 {
	
		  public static void main(String[] args) {
		    String str1 = "123.45";
		    try {
		        double value1 = Double.parseDouble(str1);
		        System.out.println("value1 = " + value1);
		      } catch (NumberFormatException e){
		    	  System.out.println("Error in parseing" +str1);
		      }
		    
		    String str2="8H.9";
		   
		    
		    try {
		      double value2 = Double.parseDouble(str2);
		      System.out.println("value2 = " + value2);
		    } catch (NumberFormatException e) {
		      System.out.println("Error in parsing " + str2);
		      System.out.println();
		      
		    }
		  }
}



