package constructors;

public class Library {



    public static void main(String[] args) {


        Book book = new Book(12323,"michaelsdfsdsdc","sdvnbsdfsdihfcbdhsbchisdbchsdcsdbcjhsdjcdsjdfk");

        book.info();
        Book book0=new Book(122,"Pushkjhvjhin","Dobkhjbkjbjchka");
        Book book1=new Book(378,"Paulo Chelhlkbnkjo","Veronika wants to die");
        Book book2=new Book(567,"Shakesphjvhkjbkare","Dyfuyvvujhvbjhjvhbbjjbollar");

        Book [] library=new Book[3];

        Book [] books= {book, book1,book2};

        library[0]=book;
        library[1]=book1;
        library[2]=book2;


        int count=1;
        for (Book eachBook : books) {
            System.out.println("Book: " +count++ );
             System.out.println("The writer of the " + eachBook.title + " is: " + eachBook.author + " and his book has " + eachBook.page + " pages ");
            eachBook.info();

        }
//
//
//
//




    }
}
