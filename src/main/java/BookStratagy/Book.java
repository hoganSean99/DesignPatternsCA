package BookStratagy;

public abstract class Book {
    CoverBehaviour coverBehaviour;

    public Book() {
    }

    public void setCoverBehaviour(CoverBehaviour coverBehaviour)
    {
        this.coverBehaviour = coverBehaviour;
    }

    public String cover()
    {
        return coverBehaviour.cover();
    }

    public abstract String display();
}
