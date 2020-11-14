package TrabalhoPratico;

public class Book {
    private String name;
    private double price;
    private Author author;
    private int qty = 0;
    
    
    
    
    //Constructor
    public Book(String varNome, Author varAuthor,double varPrice ){       
        name = varNome;
        price = varPrice;
        author = varAuthor;       
    } 
    public Book(String varNome, Author varAuthor,double varPrice, int varQty){       
        name = varNome;
        price = varPrice;
        author = varAuthor;       
        qty = varQty;      
    }
    
    //Getters
    public String getName(){
    return this.name;
    }   
    public Author getAuthor(){
    return this.author;    
    }
    public double getPrice(){
    return this.price;    
    }
    public int getQty(){
    return this.qty;
    }
    public String getAuthorNames(){
        return "Bahiano de Maua,Eleson Perigoso, Coletto Corinthiano,José Galo Cego,Andressinha do b8";
    }
    
    //Setters
    public void setPrice(double varPrice){
    this.price = varPrice;
    }
    public void setQty(int varQty){
    this.qty = varQty;
    }
    
    //Override toString Method
    @Override
    public String toString(){
    return "Book[name=" + this.name + ", authors=" + this.author +  ", price= " + this.price
            + ", qty=" + this.qty + "]";
    }
    
    
    
    
    
}
    
    
    
    
    

