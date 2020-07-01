package EmailApp;

import java.util.Scanner;

public class email 
{
   private  String firstname;
   private  String lastname;
   private  String password;
   private  String department;
   private  String email; 
   private int mailboxcapacity;
   private int defaultpasswordlength = 8;
   private String alternateemail; 
   private String company = "loki.com";
   
   //constructor
   
   public email(String firstname, String lastname)
   {
	   this.firstname = firstname;
	   this.lastname = lastname;
	   
	   this.department = dept();
	   
	   
	   this.password = password(defaultpasswordlength);
	    System.out.println("Your password is "+this.password);
	    
	    email = firstname.toLowerCase()+ lastname.toLowerCase()+"@"+department+"."+company;
	    
   }
   //Ask for the department
   private String dept()
   {
	   System.out.print("New worker :"+firstname+". Department Codes:\n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter the department :");
	   Scanner sc = new Scanner (System.in);
	   int choice = sc.nextInt();
	   if(choice ==1)
		   return "Sales";
	   else if(choice == 2)
		   return "Development";
	   else if (choice == 3)
		   return "Accounting";
	   else
		   return "";
	   

   }
   
   //generate  a random password
   private String password(int length)
   {
	   String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
	   char password [] = new char[length];
	   
	   for(int i = 0; i<length;i++)
	   {
		int random =  (int) (Math.random() * passwordset.length());
		password[i]= passwordset.charAt(random);
		  }
	     return new String (password);
   }
   // set the mail box capacity
   
   public void setmailboxcapacity(int capacity)
   {
	   this.mailboxcapacity = capacity;
	   
   }
   // set alternate eml
   public void setalternateemail(String altemail)
   {
	   this.alternateemail = altemail;
   }
   //change password
   public void changepassword(String pass)
   {
	   this.password = pass;
   }
   public int getmailboxcapacity()
   {
	   return mailboxcapacity;
	 }
   public String getalternateemail() {
	   return alternateemail;
   }
   public String getpassword()
   {
	   return password;
   }
   
   public String showinfo()
   {
	   return "DISPLAY NAME = "+firstname+" "+lastname+
			   "\nCOMPANY EMAIL = "+email+
			   "\nMAILBOX CAPACITY = "+mailboxcapacity+" mb"	   ;
	   
   }
   }
   

