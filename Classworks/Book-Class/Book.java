public class Book
{
	private int isbn;
	private String title;
	private double price;
	
    public void setIsbn(int i)
    {
        isbn = i;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public int getIsbn()
    {
        return isbn;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public double getPrice()
    {
        return price; 
    }
    
    public void read()
    {
	System.out.println("Enjoy reading your book!");
    }
	
    public static void main(String[] args) {
        Book book1 = new Book(1234567890, "The Great Gatsby", 19.99);
            
        book1.read();
        System.out.println(book1.getTitle());
    }

}
