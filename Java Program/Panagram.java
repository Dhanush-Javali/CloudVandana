import java.util.Scanner;

public class Panagram {
	static Scanner scan= new Scanner(System.in);
    public static void
    allLetter(String str)
    {
       str = str.toLowerCase();
       boolean allLetterPresent = true;
       
      for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("String in panagram");
        else
            System.out.println("String is not panagram");
    }
    
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		String str = scan.nextLine();
	    allLetter(str);
	}

}
