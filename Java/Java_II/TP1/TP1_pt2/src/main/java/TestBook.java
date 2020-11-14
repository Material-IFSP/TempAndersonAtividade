import TrabalhoPratico.*;

public class TestBook {
    public static void main(String[] args) throws Exception {

            
        
    Author[] authors = new Author[6];
    
    authors[0] = new Author("Bahiano de Mauá", "BaianinhoCampeaoSinuca2013@hotmail.com", 'm');
    authors[1] = new Author("Eleson Perigoso", "Eleson_ReiDelas2009@yahoo.com", 'm');
    authors[2] = new Author("Anderson Silva", "IloveElifasSoQueNao@gmail.com", 'm');
    authors[3] = new Author("Jose Galo Cego", "GaloCegoMulequePiranha2007@yahoo.com", 'm');
    authors[4] = new Author("Andressinha do b8", "AndressinhaMeninaTop2008@yahoo.com", 'f');
    authors[5] = new Author("Renate de Arauje Santes", "RenateFadeSensate12@email.com", 'm');
        
        System.out.println("\n------------------------//---------------------");
        
        Book book = new Book("Genere Neutre para Todes",authors[5],5.10, 2);
        
        
        System.out.println("Nome: " + book.getName());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Preco: " + book.getPrice());
        System.out.println("Quantidade: " + book.getQty());
        
        System.out.println("Autores: " + book.getAuthorNames());
        
         System.out.println("------------------------//---------------------");
        
        book.setPrice(22.10);
        book.setQty(4);
        
        System.out.println("Novo Preco: " + book.getPrice());
        System.out.println("Nova Quantidade :  " + book.getQty());
        
         System.out.println("------------------------//---------------------\n");
         
          System.out.println("toString Method Override : " + book.toString());
                                               
    }
}
