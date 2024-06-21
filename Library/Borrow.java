class Borrow
{
private String book_ID;
private String bookName;
private String authorName;
private String member_ID;
private String member_Name;
private long contact;
private String borrow_Date;
private String return_Date;
private String actualReturnDate="-";
private String status=;

Borrow(String book_ID,String bookName,String authorName,String member_ID,String member_Name,long contact,String borrow_Date,String return_Date,String actualReturnDate,String status)
{
this.book_ID =book_ID;
this.authorName=authorName;
this.bookName=bookName;
this.member_ID = member_ID;
this.member_Name = member_Name;
this.contact = contact;
this.borrow_Date = borrow_Date;
this.return_Date = return_Date;
this.actualReturnDate=actualReturnDate;
this.status = status;
}

public String getBookId()
{
return book_ID;
}
public String getBookName()
{
return bookName;
}
public String getAuthorName()
{
return authorName;
}
public String getMemberId()
{
return member_ID;
}
public String getMemberName()
{
return member_Name;
}
public long getContact()
{
return contact;
}
public String getBorrowDate()
{
return borrow_Date;
}
public String getReturnDate()
{
return return_Date;
}
public String getActualReturnDate()
{
return actualReturnDate;
}
public String getStatus()
{
return status;
}
}
