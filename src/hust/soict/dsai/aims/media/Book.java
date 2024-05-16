package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<>();
    public Book(int id, String title, String category, float cost) {
    	super(id,title,category,cost);
    }
	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("The author is already in the list.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("The author is not in the list.");
        }
    }
    public String toString() {
    	return "Book-" + getTitle() + "-" + getCategory() + "-"  + getCost() + "$";
    }
}
