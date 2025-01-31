package Library;

import java.util.Scanner;

public class ViewOrders implements IOOperations{

	@Override
	public void oper(Database database, User user) {
		
		System.out.println("Enter book name: ");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		int i = database.getBook(bookname);
		if(i > -1) {
			System.out.println(String.format("%-20s %-20s %-20s %-10s",
				    "Book", "User", "Qty", "Price"));
			 for(Order order: database.getAllOrders()) {
				 if(order.getBook().getName().matches(bookname)) {
					 System.out.println(String.format("%-20s %-20s %-20s %-10s",
						        order.getBook().getName(), order.getUser().getName(), 
						        order.getQty(), order.getPrice()));
				 }
			 }
			 System.out.println();
		}else {
			System.out.println("Book doesn't exists!");
		}
		user.menu(database, user);
		s.close();
	}
}
