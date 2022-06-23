   package projectLockers;
   import java.io.File;
   import java.io.FileReader;
   import java.io.FileWriter;
   import java.util.ArrayList;
   import java.util.Scanner;
   public class LockedMeProject 
   {
   static final String projectpath = "C:\\Users\\MALLIKARJUNA\\OneDrive\\Desktop\\Project";
  /**
    * This method will display the menu 
   */
   public static void displaymenu()
   {
   System.out.println("*********************");
   System.out.println("\t Lockers Pvt Ltd");
   System.out.println("Developed by: Mallikarjuna.H");
   System.out.println("*********************");
   System.out.println("\t1. Display All The Files");
   System.out.println("\t2. Add A File");
   System.out.println("\t3. Delete A File");
   System.out.println("\t4. Search A File");
   System.out.println("\t5. Exit");
   System.out.println("*********************");
   }
    /**
   *  This method will retrieve all the files 
   */
   public static void getAllFiles()
   {
	File folder = new File(projectpath);
	File[] listOfFiles = folder.listFiles();
	if(listOfFiles.length>0)
	{
	System.out.println("Files List is Below:\n");
	for(var l:listOfFiles)		
	{
	System.out.println(l.getName());
	}
	}
	else 
	{
	System.out.println("Mentioned Folder is Empty");
	}
    }
     /**
     * This method  will read and create file from user
     */
    public static void createFile() 
    {
    try
    {
	//Variable Declaration
    Scanner obj = new Scanner(System.in);
    String fileName;
    System.out.println("Enter The File Name:");//Read the file name from user
    fileName=obj.nextLine();
    int lineCount;
    System.out.println("Enter how many line in the File:");
    lineCount=Integer.parseInt(obj.nextLine());
    FileWriter fw= new FileWriter(projectpath+"\\" +fileName+".txt");
    for(int i=1;i<=lineCount;i++)// Read the file line by line
    {
	System.out.println("Enter file line");
	fw.write(obj.nextLine()+"\n");
    }
    System.out.println("File created successfully");
    fw.close();
    }
     catch(Exception EX)
    {
    }
    }
     /**
    * This method will take file name as parameter and check it is present in project folder 
       or not
    * returns boolean
    * file name is a string
    */
    public static boolean CheckFileExists(String fileName)
    {
    ArrayList<String>allFilesNames= new ArrayList<String>();
    File folder = new File(projectpath);
    File[] listOfFiles = folder.listFiles();
    if(listOfFiles.length>0)
    {
    for(var l:listOfFiles)		
    {
    allFilesNames.add(l.getName());
    }
    }
    return allFilesNames.contains(fileName);
    }
     /**
     * This method will delete the mentioned file from the user
     */
     public static void deleteFile() 
    {
    try
    {
	//Variable declaration
    Scanner obj = new Scanner(System.in);
    String fileName;
    //Read file name from user
    System.out.println("Enter The File Name to be Deleted:");
    fileName=obj.nextLine();
    ArrayList<String>allFilesNames= new ArrayList<String>();
    File folder = new File(projectpath);
    File[] listOfFiles = folder.listFiles();
    if(listOfFiles.length>0)
    {
    System.out.println("File status is Below:\n");
    for(var l:listOfFiles)		
    {
     allFilesNames.add(l.getName());
     }
     }
     File f= new File(projectpath+"\\" +fileName);
     if(allFilesNames.contains(fileName))
     {
     f.delete();
     System.out.println("File deleted successfully");
     }
     else 
     {
     System.out.println("Mentioned File dosenot exist");
     }
     }
     catch(Exception EX)
     {
     System.out.println("Unable to delete a mentioned file");
      }
      }
       /**
      * This method will checks the file present in the folder or not
       */
      public static void searchFile() 
     {
     try
     {
     Scanner obj = new Scanner(System.in);
     String fileName;
     System.out.println("Enter the File Name to be search:");
     fileName=obj.nextLine();		
     ArrayList<String>allFilesNames= new ArrayList<String>();// Arranges file in order
     File folder = new File(projectpath);
     File[] listOfFiles = folder.listFiles();
     if(listOfFiles.length>0)
     {
     for(var l:listOfFiles)		
     {
     allFilesNames.add(l.getName());
     }
     }
     File f = new File(projectpath+"\\" +fileName);
     if(allFilesNames.contains(fileName))
     {
     System.out.println("File is available");
      }
     else
      {
      System.out.println("Mentioned File is not available");
      }
      }
      catch(Exception EX)
      {
      }
      }
      }
			
		





