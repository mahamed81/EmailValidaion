import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeEmail {




	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	static Scanner scan = new Scanner(System.in);
	static List<String> list = new ArrayList<String>();


	public static void main(String[] args) 
	{

		addEmail();
		boolean flag = true;


		int choice;

		while(flag) 
		{

			System.out.print("(1) Add another email \n");
			System.out.print("(2) View list of emails\n");
			System.out.print("(3) Exit\n\n");
			System.out.print("Enter Your Choice : ");
			choice = scan.nextInt();

			switch(choice)
			{
			case 1 : addEmail();
			break;
			case 2 : printList();
			break;
			case 3 : flag= false;
			break;
			default : System.out.print("Wrong Choice!!!");
			}
		}

	}

	private static void printList() 
	{
		for(String li:list) 
		{
			System.out.println(li);
		}
	}

	public static void addEmail()
	{

		Scanner newScanner = new Scanner(System.in);
		System.out.println("Enter an email");	

		String email = newScanner.nextLine();

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(email);

		if(m.matches()) 
		{
			list.add(email);
			System.out.println("The email address " + email + " has successfully been added");
		}else 
		{
			System.out.println("The email address " + email + " is invalid");
		}

	}

}


