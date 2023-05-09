package zadanie4;

public class PaperBook extends Book{
    private int releaseYear;


    public PaperBook(String title, String author, int numberOfPages, int releaseYear) {
        super(title, author, numberOfPages);
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
