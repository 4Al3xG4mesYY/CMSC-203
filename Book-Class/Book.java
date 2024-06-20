public class Book
{
	private int isbn;
	private String title;
	private double price;
	
	public Book(int i, String t, double p){
	    this.isbn = i;
	    this.title = t;
	    this.price = p;
	}


	public void read()
	{
	    System.out.println("Enjoy reading your book!");
	}
    
    public static void main(String[] args) {
        Book book1 = new Book(1234567890, "The Great Gatsby", 19.99);
        book1.read();
    }
}
