package model.library;

import model.book.Book;

public class Librarian {

    private String name;
    private int age;
    private Library managingLibrary;
    private Book favBook;

    public Librarian(String name, int age, Library lib, Book bk) {
        //TODO: complete the specifications and implementation of this method
        this.name = name;
        this.age = age;
        managingLibrary = lib;
        favBook = bk;
    }

    // getters
    public String getName() { return name; }
        //TODO: complete the specifications and implementation of this method
    public int getAge() { return age; }
        //TODO: complete the specifications and implementation of this method
    public Library getManagingLibrary() { return managingLibrary; }
        //TODO: complete the specifications and implementation of this method
    public Book getFavBook() { return favBook; }
        //TODO: complete the specifications and implementation of this method

    // REQUIRES: lib != null
    // MODIFIES: this
    // EFFECTS: changes this librarian's managing library to the one given.
    //          Look carefully at the implementation of library - does it
    //          also have an associated librarian field? Does it make a
    //          difference in the implementation of this method?
    public boolean changeLibrary(Library lib) {
        //TODO: complete the specifications and implementation of this method
        if(!managingLibrary.equals(lib)) {
            managingLibrary = lib;
            lib.hireLibrarian(this);
            return true;
        }
        return false;
    }


}
