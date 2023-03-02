class Publications{
    private int price;
    private String author,title;

    Publications(String t,String a,int p){
        title=t;
        author=a;
        price=p;
    }
    public int getPrice(){
        return price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}

class Book extends Publications{
    int PageConut;
    Book(int p,String t,String a,int pr){
        super(t,a,pr);
        PageConut=p;
    }

    public void display(){
        System.out.println("The details of the book are: ");
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Price: Rs."+ getPrice());
        System.out.println("Page Count: "+ PageConut);
    }
}
class Album extends Publications{
    int songLength;
    Album(int sl,String t,String a, int pr){
        super(t,a,pr);
        songLength=sl;
    }
    public void display(){
        System.out.println("The details of the Album are: ");
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Price: Rs."+ getPrice());
        System.out.println("Song Length: "+ songLength+" min");
    }
}


public class question_15 {
    public static void main(String[] args) {
        Book book1=new Book(200, "Game Of Thrones", "GRRM", 3000);
        book1.display();

        System.out.println();
        Album album1=new Album(25,"Game of Thrones","GRRM",3000);
        album1.display();
    }
}
