package Library;

import java.util.ArrayList;

public class ViewBooks implements IOOperations{

	@Override
	public void oper(Database database, User user) {
		ArrayList<Book> books = database.getAllBooks();
		
		System.out.println(String.format("%-20s %-20s %-20s %-10s %-5s %-10s %-10s",
			    "Name", "Author", "Publisher", "CLA", "Qty", "Price", "Brw Copies"));
			for (Book b : books) {
			    System.out.println(String.format("%-20s %-20s %-20s %-10s %-5d %-10.2f %-10d",
			        b.getName(), b.getAuthor(), b.getPublisher(), b.getAddress(),
			        b.getQty(), b.getPrice(), b.getBrwcopies()));
			}
			System.out.println();
			user.menu(database, user);
	}

}
