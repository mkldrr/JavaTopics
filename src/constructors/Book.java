package constructors;

public class Book {



    int page;
    String author;
    String title;


     public Book(int page,String author,String title){

        if (page>100 && author.length()>10&& title.length()>20){
                   this.page=page;
                   this.author=author;
                   this.title=title;
            System.out.println("all credentials are correct ");
        }else System.out.println("in valid ");
    }

    public void info(){

        System.out.println("page : "+this.page);
        System.out.println("Autor :"+ this.author);
        System.out.println("title :"+ this.title);
        System.out.println();


    }
}
