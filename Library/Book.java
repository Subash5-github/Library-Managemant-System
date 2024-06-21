class Book{
	String bookId;
	String title;
	String author;
	String status;
Book(String bookId,String title,String author,String status){
       this.bookId=bookId;
       this.title=title;
       this.author=author;
       this.status=status;
}
public String getBookId(){
	return bookId;
}

public String getTitle(){
	return title;
}
public String getAuthor(){
	return author;
}
public String getStatus(){
	return status;
}
public String toString(){
	return bookId+" "+title+" "+author+" "+status;
}
}
