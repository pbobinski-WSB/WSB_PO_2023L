package wsb.po.seventh.invoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {

    Address address;
    @BeforeEach
    void setUp() {
        address =  new Address("1","2","3","4","5" );

    }

    @Test
    void format() {
        assertEquals("1\n2\n3, 4 5",address.format());
    }
}