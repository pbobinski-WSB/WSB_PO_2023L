package wsb.po.seventh.invoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    Invoice invoice;
    @BeforeEach
    void setUp() {
        invoice =  new Invoice(new Address("1","2","3","4","5"));
    }
    @Test
    void add() {
        assertEquals(0,invoice.getItems().size());
        Product product = new Product("a",2);
        invoice.add(product,5);
        assertEquals(1,invoice.getItems().size());
    }

    @Test
    void format() {

        Product product = new Product("a",2);
        invoice.add(product,5);
        assertEquals("                     I N V O I C E\n\n" +
                "1\n" +
                "2\n" +
                "3, 4 5\n\n" +
                "Description                      Price  Qty   Total\n" +
                "a                                 2,00    5   10,00" +
                "\n\n" +
                "AMOUNT DUE: $   10,00",invoice.format());
    }

    @Test
    void getAmountDue() {
        assertEquals(0,invoice.getAmountDue());
        Product product = new Product("a",2);
        invoice.add(product,5);
        Product product2 = new Product("b",4);
        invoice.add(product2,3);
        Product product3 = new Product("c",12);
        invoice.add(product3,2);
        assertEquals(46,invoice.getAmountDue());

    }
}