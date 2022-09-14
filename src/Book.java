public class Book {
    private String title;
    private int page;
    private float price;
    public Book(){
        title = "Unnamed";
        page = 0;
        price = 0;
    }
    public Book(String t, int p, float pr){
        title = t;
        price = pr;
        page = p;
    }
    void SetPrice(float price){
        this.price = price;
    }
    float GetPrice(){
        return price;
    }
    void SetPage(int page){
        this.page = page;
    }
    int GetPage(){
        return page;
    }
    void RenameBook(String title){
        this.title = title;
        System.out.println("Current book name is " + title);
    }
    void BookStatus(){
        System.out.println("Current book name is "+ title + " , it has "+page+" pages and cost is: "+price);
    }
}
