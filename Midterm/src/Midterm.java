import java.util.Scanner;
import java.util.ArrayList;

public class Midterm 
{


     
     public static void menu(ArrayList<String> namelist, ArrayList<String> agelist)
    { 
    System.out.println("========Options========");
    System.out.println("1. Add entry");
    System.out.println("2. Delete entry");
    System.out.println("3. View all entries");
    System.out.println("4. Update an entry");
    System.out.println("0. Exit");
    System.out.println("");
    System.out.print("Selection an option: ");
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    switch (option) 
    {

    case 1:
        add(namelist, agelist);
      break;

    case 2:
        delete(namelist, agelist);
        break;

    case 3:
          view(namelist, agelist);
          break;
    case 4:
          edit(namelist, agelist);
          break;
    case 0:
          System.out.println("Goodbye!");
          System.exit(0);
          break;
    default:
          System.out.println("Invalid selection. Try again");
          System.out.println();
          System.out.println("Press Any Key To Continue...");
          new java.util.Scanner(System.in).nextLine();
          menu(namelist, agelist);
        }
    }
     
     
     //ADD
    public static void add( ArrayList<String> namelist, ArrayList<String> agelist)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("========Add Entry========");
    System.out.println("1. Enter Name: ");
    namelist.add(sc.nextLine());
    System.out.println("2. Enter Age: ");
    agelist.add(sc.nextLine());
    System.out.println("Added Successful");
    System.out.println();
    System.out.println("Press Any Key To Continue...");
    new java.util.Scanner(System.in).nextLine();
    menu(namelist, agelist);
    }
    
    
    
    //DELETE
    public static void delete(ArrayList<String> namelist, ArrayList<String> agelist)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("========Delete an Entry========");
    System.out.println("1. Enter Name to Delete: ");
    String namedel = sc.nextLine();
    for (int i = 0; i < namelist.size(); i++) 
        {
            if(namelist.get(i).equals(namedel))
            {               
                System.out.println(namelist.get(i) + " has been deleted");
                namelist.remove(i);
                agelist.remove(i);
                System.out.println();
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                menu(namelist, agelist);
            }
            else
            {
                System.out.println("No " + namedel + " in the list");
                System.out.println();
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                menu(namelist, agelist);
            }
        }
    }
    
    //VIEW
    public static void view(ArrayList<String> namelist, ArrayList<String> agelist)
    {
    for (int i = 0; i < namelist.size(); i++) 
        {
        System.out.println("========View All Entries========");
        System.out.println(namelist.get(i) + " is " + agelist.get(i));
        }
        System.out.println();
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        menu(namelist, agelist);    
    }
    
    
    //UPDATE
    public static void edit(ArrayList<String> namelist, ArrayList<String> agelist)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("========Update an Entry========");
    System.out.println("1. Enter Name to Edit: ");
    String nameedit = sc.nextLine();
    for (int i = 0; i < namelist.size(); i++) 
        {
            if(namelist.get(i).equals(nameedit))
            {     
                System.out.println("Enter New Name:");
                String newname = sc.nextLine();
                namelist.set(i, newname);
                System.out.println("Enter New Age:");
                String newage = sc.nextLine();
                agelist.set(i, newage);
                System.out.println("Update Successful");
                System.out.println();
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                menu(namelist, agelist);
            }
            else
            {
                System.out.println("No " + nameedit + " in the list");
                System.out.println();
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                menu(namelist, agelist);
            }
        }
    
    menu(namelist, agelist);   
    }
    public static void main (String[] args)
    {    
    ArrayList<String>            namelist  = new ArrayList();
    ArrayList<String>            agelist   = new ArrayList();
    menu(namelist, agelist); 
     }
}