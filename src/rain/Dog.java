package rain;

public class Dog {
    
    private String name;
    private int age;
    private Book favBook;

    public Dog(String n, int a, Book f) {
        name = n;
        age = a;
        favBook = new Book(f);
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public Book getFavBook(){
        return favBook;
    }

    public void setFavBook(Book b){
        favBook = b;
    }
}
