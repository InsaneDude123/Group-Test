package rain;

public class Unit5_1 {
    public static void main(String[] args){

        Book b = new Book(100, "CSA");

        System.out.println(b.getTitle());
        //System.out.println(b.page); //page is private variable
        System.out.println();

        //mod-2.b.1 (object has-a variable)
        //mod-2.b.2 (constructors set initial state)
        //mod-2.b.3 (constructor vairables are local)
        //mod-2.b.4 (Copy mutable objects to avoid aliasing, affecting original object)
        //mod-2.b.5 (no constructor)

        Dog d = new Dog("Rich", 10, b);
        System.out.println(d.getFavBook().getTitle());
        b.setTitle("CSP");
        System.out.println(d.getFavBook().getTitle());
        Cat c = new Cat();
        System.out.println(c.getName());

        //mod-2.c.1 (comments not executed)
        //mod-2.c.2 (/*  */)
        //mod-2.c.3 (precondition is sth that must be true for program to behave properly)
        //mod-2.c.4 (postcondition describe outcome)
        //mod-2.c.5

        /*this is also a comment
          
          
        yippie!!! */

        //mod-2.d.1 (accessor methods to obtain value)
        //mod-2.d.2 (non-void)
        //mod-2.d.3 (return by value)
        //mod-2.d.4 (copy of reference is returned)
        //mod-2.d.5 (return controls flow)
        //mod-2.d.6 (toString)
        //mod-2.d.7 (printing object)

        Rectangle r = new Rectangle(5, 5);
        System.out.println(r);
    }
}
