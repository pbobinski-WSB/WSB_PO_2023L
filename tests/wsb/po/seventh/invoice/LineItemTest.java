package wsb.po.seventh.invoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineItemTest {

    LineItem lineItem;
    @BeforeEach
    void setUp() {
        lineItem =  new LineItem(new Product("a",2),5);
    }

    @Test
    void getTotalPrice() {
        assertEquals(10,lineItem.getTotalPrice());
    }

    @Test
    void format() {
        assertEquals("a                                 2,00    5   10,00",lineItem.format());
    }
}