package model.book;

import model.library.Library;

public class Book {

    private String title;
    private String author;
    private BookType type;
    private int year;
    private int edition;
    private Library homeLibrary;
    private boolean isOnLoan;

    public Book(String title, String author, BookType type, int year, int ed) {
        //TODO: complete the implementation of this method
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = ed;
        this.type = type;
        homeLibrary = null;
        isOnLoan = false;
    }

    // getters
    public String getTitle() { return title; }
        //TODO: complete the implementation of this method
    public String getAuthor() { return author; }
        //TODO: complete the implementation of this method
    public BookType getType() {return type; }
        //TODO: complete the implementation of this method
    public int getYear() { return year; }
        //TODO: complete the implementation of this method
    public int getEdition() { return edition; }
        //TODO: complete the implementation of this method
    public Library getHomeLibrary() { return homeLibrary; }
        //TODO: complete the implementation of this method
    public boolean onLoan() { return isOnLoan;}

    // MODIFIES: this
    // EFFECTS: set the book to be not on loan
    public void notOnLoan() { isOnLoan = false; }

    // MODIFIES: this
    // EFFECTS: set the book to be on loan
    public void nowOnLoan() { isOnLoan = true; }
    //TODO: complete the implementation of this method

    // REQUIRES: home != null
    // MODIFIES: this
    // EFFECTS: sets this book's home library to the one passed as parameter
    public void setHomeLibrary(Library home) {
        //TODO: complete the implementation of this method
        homeLibrary = home;
        home.storeBook(this);
    }
}

//    // EFFECTS: return true if this book is on loan, else return false
//    public boolean onLoan() {
//        //TODO: complete the implementation of this method
//        if(isOnLoan) {
//            return true;
//        }else {
//            return false;
//        }
//    }