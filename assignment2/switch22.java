import java.util.Scanner;
class switch22
{
       public static void main(String args[])
        {
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter checking name");
		  char name =sc.next().charAt(2);
		  
		  switch(name) 
		  {case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   System.out.println("vowel in lower case ");
		   break;
		   
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   System.out.println("vowel in upper case");
		   break;
		   
		   default:
		   System.out.println("constants ");
		   
		 
		  }
		}

}