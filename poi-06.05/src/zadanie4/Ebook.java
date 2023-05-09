package zadanie4;

public class Ebook extends Book{
    private int size;
    private String format;

    public Ebook(String title, String author, int numberOfPages, int size, String format) {
        super(title, author, numberOfPages);
        this.size = size;
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
