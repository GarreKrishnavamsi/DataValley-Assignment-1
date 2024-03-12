import java.util.Scanner;
public class replaceCharacterAtSpecificIndex
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter The String :");
      String str = sc.nextLine();
      System.out.println("Enter The Index Value  :");
      int index = sc.nextInt();
      System.out.println("Enter The Character that replaced:");
      char ch = sc.next().charAt(0);
      if(index>=str.length()){
          System.out.println("You Have Entered Value more than String length");
      }
      else{
      str = str.substring(0, index) + ch+ str.substring(index + 1);
      System.out.println(str);
	}
	}
}
