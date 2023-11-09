public abstract class Publication{
    private String Title;
    private float Price;
    private int copies;

    Publication(String Title,float Price,int copies){
        this.Title = Title;
        this.Price = Price;
        this.copies = copies;
    }

    public String getTitle(){
        return Title;
    }

    public int getCopies(){
        return copies;
    }

    public float getPrice(){
        return Price;
    }

    public void saleCopy(){
        System.out.println("Title : "+getTitle()+"\nPrice : "+getPrice()+"\nCopies : "+getCopies()+"\nYour total amount :"+getPrice()*getCopies());
    }
}