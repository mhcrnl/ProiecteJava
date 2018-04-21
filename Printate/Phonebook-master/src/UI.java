import java.io.IOException;
import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		PhoneBook pb = new PhoneBook();
		int choice;
		
		while (true) {
			System.out.println(
					"Your phonebook contains " + Contact.count + " contacts. Choose one of following options: ");
			System.out.println("1 View all contacts " + "\n2 Add a new contact \n3 Search by full name" +"\n4 Delete by full name"+ "\n5 Exit");
			try {
				choice = input.nextInt();
			} catch (Exception e) {
				System.out.println("Input number 1-5!");
				input = new Scanner(System.in);
				continue;
			}
			

			switch (choice) {
			case 1:
				System.out.println("Contacts:");
				pb.viewAllContacts();
				break;
			case 2:
				pb.addPerson();
				break;
			case 3:
				System.out.println("Search by name: ");
				input.nextLine();
				String name = input.nextLine();
				pb.searchContact(name);
				break;
			case 4:
				System.out.println("Delete by name: ");
				input.nextLine();
				String delName = input.nextLine();
				pb.deleteContact(delName);
				break;
			case 5:
				pb.saveContacts();
				System.exit(0); // hm
			}
		}
	}
}
