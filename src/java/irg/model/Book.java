/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irg.model;

/**
 *
 * @author Mobile Apps
 */
public class Book implements java.io.Serializable{
    
    private static final long serialVersionId=29893L;
    
    private String title;
    private String author;
    private String description;
    private String year;
    private double price;
    private int pages;
    private int bookId;
    
    public Book(){
        
    }

    public Book(String title, String author, String description, String year, double price, int pages, int bookId) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.price = price;
        this.pages = pages;
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", description=" + description + ", year=" + year + ", price=" + price + ", pages=" + pages + ", bookId=" + bookId + '}';
    }

    
}
