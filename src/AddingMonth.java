import java.util.Calendar;

public class AddingMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Calendar now = Calendar.getInstance();
		    
		    System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1)
		                        + "-"
		                        + now.get(Calendar.DATE)
		                        + "-"
		                        + now.get(Calendar.YEAR));
		    
		    //add months to current date using Calendar.add method
		    now.add(Calendar.MONTH,10);
		 
		    System.out.println("date after 10 months : " + (now.get(Calendar.MONTH) + 1)
		                        + "-"
		                        + now.get(Calendar.DATE)
		                        + "-"
		                        + now.get(Calendar.YEAR));
		  
		    
		    //substract months from current date using Calendar.add method
		    now = Calendar.getInstance();
		    now.add(Calendar.MONTH, -5);
		 
		    System.out.println("date before 5 months : " + (now.get(Calendar.MONTH) + 1)
		                        + "-"
		                        + now.get(Calendar.DATE)
		                        + "-"
		                        + now.get(Calendar.YEAR));
		    
		  }

	}

