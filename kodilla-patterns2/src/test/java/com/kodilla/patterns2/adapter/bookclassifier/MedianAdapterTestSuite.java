package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2000, "Signature 1"));
        bookSet.add(new Book("Author 2", "Title 2", 2001, "Signature 2"));
        bookSet.add(new Book("Author 3", "Title 3", 2002, "Signature 3"));
        bookSet.add(new Book("Author 4", "Title 4", 2003, "Signature 4"));
        bookSet.add(new Book("Author 5", "Title 5", 1999, "Signature 5"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int medianYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(medianYear);
        assertEquals(2001, medianYear);
    }
}
