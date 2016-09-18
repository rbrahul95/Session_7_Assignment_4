/*Assignment – Create student result processing system with an abstract
class.
*/

public class Session_7_Assignment_4 {
    public static void main(String[] args) {

       try{
			String str = "My Name Is Rahul Bhatia";
		System.out.println("Length of array: " + str.length()+"\n");
		
		//the request index is invalid.
		char ch = str.charAt(50);
			
		}
		catch(Exception e){
			
			System.out.println(e);
			
		}
		
		
	}
	
}
/* 
  Output :   
  Length of array: 23

  java.lang.StringIndexOutOfBoundsException: String index out of range: 50
  
 
*/