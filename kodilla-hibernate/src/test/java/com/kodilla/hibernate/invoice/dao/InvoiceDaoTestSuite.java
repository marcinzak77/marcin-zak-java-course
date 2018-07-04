package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        BigDecimal valueOne = new BigDecimal(10);
        BigDecimal valueTwo = new BigDecimal(20);
        BigDecimal valueThree = new BigDecimal(30);

        //Given
        Product productOne = new Product("Product One");
        Product productTwo = new Product("Product Two");
        Product productThree = new Product("Product Three");
        Item itemOne = new Item(productOne, valueOne, 10);
        Item itemTwo = new Item(productTwo, valueTwo, 20);
        Item itemThree = new Item(productThree, valueThree, 5);
        List<Item> itemsList = new ArrayList<>(Arrays.asList(itemOne, itemTwo, itemThree));
        productOne.getItems().add(itemOne);
        productTwo.getItems().add(itemTwo);
        productThree.getItems().add(itemThree);

        Invoice invoiceOne = new Invoice("01/06/2018", itemsList);

        //When
        invoiceDao.save(invoiceOne);
        int id = invoiceOne.getId();


        //Then
        Assert.assertEquals(id, invoiceOne.getId());

        //Cleanup
         invoiceDao.delete(id);


    }
}
