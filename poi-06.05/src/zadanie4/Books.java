package zadanie4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Books {
    public static void main(String[] args) {

        ArrayList <Book> book = new ArrayList<>();

        book.add(new Ebook("W pustyni i w puszczy", "Henryk Sienkiewicz", 382, 40, "PDF"));
        book.add(new PaperBook("Harry Potter i Komnata tajemnic", "J.K. Rowling", 356, 2007));
        book.add(new Ebook("Hobbit", "J.R.R Tolkien", 283, 29, "PDF" ));
        book.add(new PaperBook("48 praw władzy", "Robert Greene", 214,1923));

        Collections.sort(book, Comparator.comparing(Book::getTitle));

        for (Book book1 : book){
            System.out.println(book1.getTitle());
        }
    }
}
