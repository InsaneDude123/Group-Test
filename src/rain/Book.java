package rain;

public class Book { //public
    
    //mod-2.a.1 (public private)
    //mod-2.a.2
    //mod-2.a.3 (classes are public)
    //mod-2.a.4 (instance variables are private)
    //mod-2.a.5 (constructors are public)
    //mod-2.a.6 (methods can be public or private)
    //mod-3.a.1 (encapsulation)
    //mod-3.a.2 (data accessible/ modifiable)
    //mod-3.a.3
    //mod-3.a.4 (accessor and mutator methods)

    private int page; //private
    private String title; //private

    public Book(int p, String t){ //public
        page = p;
        title = t;
    }

    public Book(Book b){
        page = b.page;
        title = b.title;
    }

    public String getTitle(){ // can be public or private, depending on use
        return title;           // getters allow the variable to be accessed
    }       
    
    public void setTitle(String t){
        title = t;
    }

    public int getPage(){
        return page;
    }

    public void setPage(int p){ //setters allow the variable to be modified
        page = p;
    }
}
