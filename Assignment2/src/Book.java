public class Book extends Publication
{
    private String author;

    Book(String Title,String author,float Price,int copies){
        super(Title,Price,copies);
        this.author = author;
    }


    public void orderCopies(int copies){
        System.out.println("Title : "+getTitle()+"\nPrice :"+getPrice()+"\nCopies : "+getCopies());

    }
    public void saleCopy(){
        System.out.println("Title : "+getTitle()+"\nAuthor : "+author+"\nPrice : "+getPrice()+"\nCopies : "+getCopies()+"\nYour total amount :"+getPrice()*getCopies());
    }
}
