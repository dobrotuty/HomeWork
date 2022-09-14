public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("CrimeAndPunishment",845,1599);
        Book b2 = new Book();
        b1.BookStatus();
        b2.BookStatus();
        b2.RenameBook("TreasureIsland");
        b2.SetPrice(399);
        b2.SetPage(423);
        b2.BookStatus();
    }
}
