package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book> books = new HashMap<>();
        bookSet.stream().forEach(s -> books.put(new BookSignature(s.getSignature()), (
                new com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book(s.getAuthor(), s.getTitle(), s.getPublicationYear()))));
        return medianPublicationYear(books);
    }
}
