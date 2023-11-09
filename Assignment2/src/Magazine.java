public class Magazine extends Publication{
    private String CurrentIssue;
    private String ReceiveIssue;

    Magazine(String title,float price,int copies,String CurrentIssue,String ReceiveIssue){
        super(title,price,copies);

        this.CurrentIssue = CurrentIssue;
        this.ReceiveIssue = ReceiveIssue;
    }

    public void orderQty(int copies){
        System.out.println("The quantity of magazines is "+ getCopies());
    }

    public void saleCopy(){
        System.out.println("Title : "+getTitle()+"\nPrice : "+getPrice()+"\nQuantity of order : "+getCopies()+"\nCurrent Issue : "+ CurrentIssue +"\nReceiveIssue : "+ ReceiveIssue +"\nYour total amount : "+getPrice()*getCopies());
    }
}