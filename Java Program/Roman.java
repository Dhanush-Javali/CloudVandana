import java.util.Scanner;

public class Roman {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("Enter the roman numerals between (I to XX)(1 to 20)");
    	 String data = scan.nextLine();
      
       switch (data) {
       case    "I":
    	   System.out.println("The integer value for ("+ data +") is : 1");
    	   break;
       case    "II":
    	   System.out.println("The integer value for ("+ data +") is : 2");
    	   break;
       case    "III":
    	   System.out.println("The integer value for ("+ data +") is : 3");
    	   break;
       case    "IV":
    	   System.out.println("The integer value for ("+ data +") is : 4");
    	   break;
       case    "V":
    	   System.out.println("The integer value for ("+ data +") is : 5");
    	   break;
       case    "VI":
    	   System.out.println("The integer value for ("+ data +") is : 6");
    	   break;
       case    "VII":
    	   System.out.println("The integer value for ("+ data +") is : 7");
    	   break;
       case    "VIII":
    	   System.out.println("The integer value for ("+ data +") is : 8");
   	   break;
       case    "IX":
    	   System.out.println("The integer value for ("+ data +") is : 9");
    	   break;
       case    "X":
    	   System.out.println("The integer value for ("+ data +") is : 10");
    	   break;
       case    "XI":
    	   System.out.println("The integer value for ("+ data +") is : 11");
    	   break;
       case    "XII":
    	   System.out.println("The integer value for ("+ data +") is : 12");
    	   break;
       case    "XIII":
    	   System.out.println("The integer value for ("+ data +") is : 13");
    	   break;
       case    "XIV":
    	   System.out.println("The integer value for ("+ data +") is : 14");
    	   break;
       case    "XV":
    	   System.out.println("The integer value for ("+ data +") is : 15");
    	   break;
       case    "XVI":
    	   System.out.println("The integer value for ("+ data +") is : 16");
    	   break;
       case    "XVII":
    	   System.out.println("The integer value for ("+ data +") is : 17");
    	   break;
       case    "XVIII":
    	   System.out.println("The integer value for ("+ data +") is : 18");
    	   break;
       case    "XIX":
    	   System.out.println("The integer value for ("+ data +") is : 19");
    	   break;
       case    "XX":
    	   System.out.println("The integer value for ("+ data +") is : 20");
    	   break;
    	   
    	   default :
    		   System.out.println("roman numerals only");
    		   break;
       }    
       
    }
}
