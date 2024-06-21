import java.util.Scanner;
public class LibraryManagement{
	public static void main(String[] args) {
	     LibraryManagement librarymanagement=new  LibraryManagement();
		        Library library = new Library();
			Admin admin = new Admin();
			User user = new User();
			Scanner sc = new Scanner(System.in);
		while (true) {
		    System.out.println("Enter your choice \n 1. User Login \n 2. Admin Login \n 3. New User \n 4. Exit");
		    int choice = sc.nextInt();
		    sc.nextLine(); 

		    switch (choice) {
		        case 1:
		            System.out.println("Enter the Username");
		            String userId = sc.nextLine();
		            library.userLogin(userId);
		            break;
		        case 2:
		            System.out.println("Enter the Username");
		            admin.setAdminId(sc.nextLine());
		            System.out.println("Enter the password:");
		            admin.setPassword(sc.nextLine());
		            librarymanagement.login(admin.getAdminId(), admin.getPassword());
		            break;
		        case 3:
		        	System.out.println("Enter the UserId");
				userId = sc.nextLine();
				System.out.println("Enter the UserName");
				String userName = sc.nextLine();
				System.out.println("Enter the Contact");
				String contact = sc.nextLine();
				librarymanagement.userRegister(userId,userName,contact);
				break;
		        case 4:
		            System.exit(0);
		            break;
		        default:
		            System.out.println("Invalid choice. Please try again.");
		            break;
		    }
		}
	    }
	    
	  private void showAdminMenu() {
                while(true){  
				System.out.println("\n-------------------------------------Menu---------------------------------------");
				System.out.println("1.New Admin");
				System.out.println("2.Add Books");
				System.out.println("3.Add Member");
				System.out.println("4.List of All Available books");
				System.out.println("5.Search Book by Name");
				System.out.println("6.Remove Book");
				System.out.println("7.Borrow Book");
				System.out.println("8.Return Book");
				System.out.println("9.Enter the Author name get a book written by him/her");
				System.out.println("10.User History");
				System.out.println("11.Current Holding Book");
				System.out.println("12.Exit");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice){
					case 1:
						System.out.println("Enter the id:");
                                                 String admin_id = sc.nextLine();
						System.out.println("Enter the password:");
						String password = sc.nextLine();
						System.out.println("Enter the Name:");
						String name = sc.nextLine();
						library.addAdmin(admin_id,password,name);
						break;
					case 2:
        					 try {
							library.addBook();
						    } catch (Exception e) {
							e.printStackTrace();
						    }
						 break;
					case 3:
						System.out.println("Enter the UserId");
						String userId = sc.nextLine();
						System.out.println("Enter the UserName");
						String userName = sc.nextLine();
						System.out.println("Enter the Contact");
						String contact = sc.nextLine();
						library.userRegister(userId,userName,contact);
						break;
					case 4:
						try {
							for(Book book : availableAllBook()) {
							
							System.out.println(book);
							}
						    } catch (Exception e) {
							e.printStackTrace();
						    }
						 break;
					case 5:
						try {
						    System.out.println("Enter the book name:");
						    String title = sc.nextLine();
                                                    library.availableParticularBook(title);
						} catch (Exception e) {
						    e.printStackTrace();
						}
						break;
					case 6:
						try{
							System.out.println("Enter the book id to be deleted");
							String book_id = sc.nextLine();
							library.removeBook(book_id);
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
					case 7:
						try{
							library.borrowBook();
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
					case 8:
						try{
							showReturnMenu();
						}catch(Exception e){
							e.printStackTrace();
						}
						break;
					case 9:
						System.out.println("Enter the Author name");
						String author = sc.nextLine();
						library.getBookByAuthor(author);
						break;
					case 10:
						userHistory();
						break;
					case 11:
						System.out.println("Enter the UserId");
						userId = sc.nextLine();
						library.currentHoldBook(userId);
						break;
					case 12:
						System.exit(0);
						break;
                                        default:
                                                System.out.println("Invalid choice");
                                                break;
				}
			}    
    }
    private void showUserMenu(){
        while(true){
			System.out.println("\n-------------------------------------Menu---------------------------------------");
				System.out.println("1.List of All Available books");
				System.out.println("2.Search Book by Name");
				System.out.println("3.Enter the Author name get a book written by him/her");
				System.out.println("4.Current Holding Book");
				System.out.println("5.Exit");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice){
					case 1:
						try {
							for(Book book : library.availableAllBook()) {
							
							System.out.println(book);
							}
						    } catch (Exception e) {
							e.printStackTrace();
						    }
						 break;
					case 2:
						try {
						    System.out.println("Enter the book name:");
						    String title = sc.nextLine();
						    library.availableParticularBook(title);
						} catch (Exception e) {
						    e.printStackTrace();
						}
						break;
					case 3:
						System.out.println("Enter the Author name");
						String author = sc.nextLine();
						library.getBookByAuthor(author);
						break;
					case 4:
						System.out.println("Enter the UserId");
						String userId = sc.nextLine();
						library.currentHoldBook(userId);
						break;
					case 5:
						System.exit(0);
						break;	
				}
		}	
    }
    private void showReturnMenu(){
    	while(true){
    			System.out.println("\n-------------------------------------Menu---------------------------------------");
			System.out.println("1.Penalty");
			System.out.println("2.Return");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1:
					System.out.println("enter the book Id ");
					bookId=sc.next();
					System.out.println("enter the Member Id ");
					memId=sc.next();
					penalty(bookId,memId);
					break;
				case 2:
					returnBook();
					break;
				case 3:
					System.exit(0);
					break;
			}
    	}
    }
   
}
