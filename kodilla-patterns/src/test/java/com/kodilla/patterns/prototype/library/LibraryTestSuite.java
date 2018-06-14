package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My new library");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n -> library.getBooks().add(new Book("Book Tittle " + n, "Author " + n, LocalDate.of(2015, 1, n))));

        //making a shallow copy of library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My new library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of library
        Library clonedLibrary2 = null;
        try {
            clonedLibrary2 = library.deepCopy();
            clonedLibrary2.setName("My new library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Book Tittle 21", "Author 21", LocalDate.of(2015,1,21)));

        //Then
        Assert.assertEquals(21, library.getBooks().size());
        Assert.assertEquals(21, clonedLibrary.getBooks().size());
        Assert.assertEquals(20, clonedLibrary2.getBooks().size());
    }
}
