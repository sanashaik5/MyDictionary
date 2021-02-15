import java.util.*;
import java.util.Map; 
import java.util.TreeMap; 
public class MyDictionary { 
  

    // Declaring a TreeMap 
    static TreeMap<String, String> tree_map; 
  
    // Function to create TreeMap 
    static void createDictionary() 
    { 
        // Creating an empty TreeMap 
        tree_map = new TreeMap<String, String>(); 
  
        System.out.println("Welcome to my Dictionary"); 
    } 
  
    // Function to Insert values in 
    // the TreeMap 

    public static void insertWord(String word,String meaning) 
    { 
        // Mapping string values to int keys 
        if(tree_map.containsKey(word))
        {
        	System.out.println("The "+word+" you want to add is already present in the Dictionary.Try adding a different one!");
        }
        else{
        tree_map.put(word,meaning); 
        
        System.out.println("\n"+word+" "+"has successfully inserted in the Dictionary"); 
           }
    } 

   
    // Function to search a key in TreeMap 
   
    public static void searchWord(String word) 
    {
     if(tree_map.containsKey(word))
      {
     	System.out.println("The meaning of "+word+ " is "+tree_map.get(word));
      }
       else{
       	System.out.println("Oops! the "+word+" is "+" not present in the Dictionary");
       }
            
    } 
  
    // Function to display the elements in TreeMap 
  
    // Function to traverse TreeMap 
    public static void displayDictionary() 
    { 
        System.out.println("\nDictionary has following Words and their meanings:"); 
        for (Map.Entry<String, String> e : tree_map.entrySet()) 
            System.out.println(e.getKey() + " = "+ e.getValue()); 
    } 
 

    public static void printMenu(){
        System.out.println("-------------------------------");
        System.out.println("Please Choose Any option from the Menu\t");
        System.out.println("1. Insert a word into the dictionary");
        System.out.println("2. Search a word from the dictionary");
        System.out.println("3. Display the Dictionary");
        System.out.println("4. Exit");
        System.out.println("-------------------------------");
    }



  
    // Driver Code 
    public static void main(String[] args) 
    { 
       
            // Creating an empty TreeMap 
       
        Scanner sc = new Scanner(System.in);
        String w,m;
        createDictionary();
        int choice;

        while(true){
            printMenu();
            System.out.println("Enter your choice:");
            
            // to validate user inputs
            while(!sc.hasNextInt()){
                System.out.println("Error! Please enter a valid integer");
                sc.next();
            }
            choice=sc.nextInt();

            // different cases to handle the users's requirement
            switch(choice){
                case 1:
                    System.out.println("Enter the word you want to add in the Dictionary:");
                    w=sc.next();
                    System.out.println("Enter its meaning in the Dictionary:");
                    m=sc.next();
                    insertWord(w,m);
                    break;
                case 2:
                    System.out.println("Enter the word for which its meaning is to be searched:");
                    w=sc.next();
                    searchWord(w);
                    break;
                case 3:
                    displayDictionary();
                    break;
                case 4:
	  System.out.println("----Have a nice day!-----");
                    System.out.println("-----Exiting-----");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice! Please choose a valid option");
            }
        }
    }
  
}