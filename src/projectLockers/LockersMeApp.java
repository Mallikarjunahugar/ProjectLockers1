package projectLockers;
import java.util.Scanner;
public class LockersMeApp 
     {
	public static void main(String[] args) 
	 {
		
	Scanner obj = new Scanner(System.in);
		int ch;
			do
	 {
			LockedMeProject.displaymenu();
		   System.out.println("Enter the choice");
		   ch=Integer.parseInt(obj.nextLine());
		   switch(ch)
	 {
		   case 1:LockedMeProject.getAllFiles();
		             break;
		   case 2: LockedMeProject.createFile();
		             break;
		   case 3: LockedMeProject.deleteFile();
          		     break;
		   case 4: LockedMeProject.searchFile();
		             break;
		   case 5: System.exit(0);
		             break;
		   default:System.out.println("Invalid Option \nTry again");
		             break;
			   
	 }
     }
			while(ch>0);
				
			obj.next();
			obj.close();
	}
	
    }

