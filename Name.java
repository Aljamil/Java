import java.util.Scanner;

public class Name
{
   public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your Name: ");

	String name = input.nextLine();

        String newName = " ";
        boolean f = false;
        char[] characters = name.toCharArray();

        

		for(int i = 0; i < characters.length; i++)
		{
	  
            if(!f && Character.isLetter(characters[i]))
	    	    {
             f = true;
			       characters[i + 1] = Character.toUpperCase(characters[i + 1]);
              
	    	    }
            else if (characters[i] == ' '){
              f = false;
            }
          
            newName = String.valueOf(characters);
		} 

          System.out.println();

	      System.out.printf("Your name is %s.%n", newName.trim());
   }


public static String capitalizeString(String string) {
  char[] chars = string.toLowerCase().toCharArray();
  boolean found = false;
  for (int i = 0; i < chars.length; i++) {
    if (!found && Character.isLetter(chars[i])) {
      chars[i] = Character.toUpperCase(chars[i]);
      found = true;
    } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
      found = false;
    }
  }
  return String.valueOf(chars);
}

}
