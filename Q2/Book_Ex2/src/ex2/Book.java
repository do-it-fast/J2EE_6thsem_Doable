package ex2;
//Book with title, author, publisher and price
public class Book 
{
	String title, author, publisher;
	 Double price;
	 
	 Book(String t, String auth, String pub, Double pr) {
	 title = t;
	 author = auth;
	 publisher = pub;
	 price = pr;
	 }
	 
	 public String toString() 
	 {
	 return "Book Details : Title " + title + "\n Author " + author + "\n" + " 	Publisher " + publisher + "\n" 	 + "price " + price;
	 }

}
