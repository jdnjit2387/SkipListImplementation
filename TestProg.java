import java.util.*;
import java.util.Random;
public class TestProg
{

   public static void main(String[] args)
   {
	   Scanner scan = new Scanner(System.in);
       /* Creating object of SkipList */
	   Random r = new Random();
	   SkipList S = new SkipList();
       char ch;
	   int i,k;
	   for ( i = 1; i <= 5; i++ )
	         S.insertElement((double) r.nextInt(20));
	      
        S.printHorizontal();
	    System.out.println("------");
	     // S.printVertical();
	      do
	        {
	            System.out.println("\nSkipList List Operations\n");
	            System.out.println("1. Find Element");
	            System.out.println("2. Insert Element");
	            System.out.println("3. Remove Element");
	            System.out.println("4. Closest key after");

	            int choice = scan.nextInt();
	            switch (choice)
	            {
	                case 1 : System.out.println("Enter the element to find");
	                Scanner scan2= new Scanner(System.in);
	                k=scan2.nextInt();
	                SkipListNode s= S.findElement((double) k);
	                if(s.key==k)
	                	System.out.println("Element found");
	                else
	                	System.out.println("Element not found");
	                break;    	
	                case 2 :
	                	System.out.println("Enter integer element to insert");
	                    Scanner scan1 = new Scanner(System.in);
	                    k=scan1.nextInt();
	                    Boolean con=S.insertElement((double) k);
	                    if(con==false)
	                    	System.out.println("Element already exists");
	                    else
	                    { 	
	                    System.out.println("Element inserted");	
	                    S.printHorizontal();
	           	    System.out.println("------");
	                    }
	                    break;
	                case 3 :
	                    System.out.println("Enter the element to be removed");
	                    Scanner scan3 = new Scanner(System.in);
	                    k=scan3.nextInt();
	                    Boolean cond=S.removeElement((double) k);
	                    if (cond==true)
	                    {
	                    	System.out.println("Element removed");
	                    	 S.printHorizontal();
	     	           	    System.out.println("------");
	                    }
	                    else
	                    	System.out.println("Element not found");
	                    break;
	                case 4: 
	                	System.out.println("Enter the element to find closest key after");
	                    Scanner scan4 = new Scanner(System.in);
	                    k=scan4.nextInt();
	                    SkipListNode s1 = S.closestKeyAfter((double) k);
	                    if(s1!=null)
	                    {
	                    Double res= s1.getKey();
	                    System.out.println("The closest key after is: "+res);
	                    }
	                    break;     
	                default :
	                    System.out.println("Wrong Entry \n ");
	                    break;
	            }
	            /*  Display List  */
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);

	        } while (ch == 'Y'|| ch == 'y');
	 }
}
