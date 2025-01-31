package Library;

import java.util.Scanner;

public class Search implements IOOperations{

	@Override
	public void oper(Database database, User user) {
		System.out.println("\nEnter book name: ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		int i = database.getBook(name);
		if(i > -1) {
			System.out.println("\n" + database.getBook(i).toString() + "\n"); 
		}else {
			System.out.println("Book doesn't exists!");
		}
		user.menu(database, user);
		s.close();
	}

}
