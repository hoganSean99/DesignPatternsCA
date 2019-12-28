package BookStratagy;

public class HorrorBook extends Book {
    public HorrorBook()
    {
        coverBehaviour = new HardCover();
    }
    @Override
    public String display() {
        return "You Chose A Horror Book";
    }
}
