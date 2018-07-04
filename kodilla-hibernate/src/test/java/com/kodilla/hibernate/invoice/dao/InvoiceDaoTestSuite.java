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

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Transactional
    @Test
    public void testInvoiceDaoSave() {
        BigDecimal valueOne = new BigDecimal(10);
        BigDecimal valueTwo = new BigDecimal(20);
        BigDecimal valueThree = new BigDecimal(30);

        //Given
        Product productOne = new Product("Product One");
        Product productTwo = new Product("Product Two");
        Product productThree = new Product("Product Three");

        Item itemOne = new Item();
        Item itemTwo = new Item();
        Item itemThree = new Item();

        Invoice invoiceOne = new Invoice("1/2018");


        itemOne.setInvoice(invoiceOne);
        itemOne.setProduct(productOne);
        itemOne.setPrice(valueOne);
        itemOne.setQuantity(10);
        productOne.getItems().add(itemOne);


        itemTwo.setInvoice(invoiceOne);
        itemTwo.setProduct(productTwo);
        itemTwo.setPrice(valueTwo);
        itemTwo.setQuantity(20);
        productTwo.getItems().add(itemTwo);

        itemThree.setInvoice(invoiceOne);
        itemThree.setProduct(productThree);
        itemThree.setPrice(valueThree);
        itemThree.setQuantity(30);
        productThree.getItems().add(itemThree);

        invoiceOne.setItems(Arrays.asList(itemOne, itemTwo, itemThree));

        //When
        productDao.save(productOne);
        int idProductOne = productOne.getId();
        productDao.save(productTwo);
        int idProductTwo = productTwo.getId();
        productDao.save(productThree);
        int idProductThree = productThree.getId();
        invoiceDao.save(invoiceOne);
        int id = invoiceOne.getId();
        itemDao.save(itemOne);
        int idItemOne = itemOne.getId();
        itemDao.save(itemTwo);
        int idItemTwo = itemTwo.getId();
        itemDao.save(itemThree);
        int idItemThree = itemThree.getId();



        //Then
        Assert.assertEquals(id, invoiceOne.getId());
        Assert.assertEquals(idProductOne, productOne.getId());
        Assert.assertEquals(idProductTwo, productTwo.getId());
        Assert.assertEquals(idProductThree, productThree.getId());
        Assert.assertEquals(idItemOne, itemOne.getId());
        Assert.assertEquals(idItemTwo, itemTwo.getId());
        Assert.assertEquals(idItemThree, itemThree.getId());

        //Cleanup
        try {
            productDao.delete(idProductOne);
            productDao.delete(idProductTwo);
            productDao.delete(idProductThree);
            itemDao.delete(idItemOne);
            itemDao.delete(idItemTwo);
            itemDao.delete(idItemThree);
            invoiceDao.delete(id);
        } catch (Exception e) {
            //do nothing
        }



    }
}
