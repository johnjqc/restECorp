package com.jsoft.restecorp.test.services;

import com.jsoft.restecorp.service.impl.CreditCardFakeGenerator;
import com.jsoft.restecorp.test.AbstractMockitoTest;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Suite test class for credit card generator
 *
 * @since 0.0.1
 * @author <a href="johnquirogac@gmail.com">John Quiroga</a>
 */
public class CreditCardFakeGeneratorTest extends AbstractMockitoTest {

    @InjectMocks
    private CreditCardFakeGenerator creditCardFakeGenerator;

    @Test
    public void testDay1() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(1);
        assertEquals(new BigDecimal(1), actual);
    }

    @Test
    public void testDay2() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(2);
        assertEquals(new BigDecimal(4), actual);
    }
    @Test
    public void testDay3() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(3);
        assertEquals(new BigDecimal(18), actual);
    }
    @Test
    public void testDay4() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(4);
        assertEquals(new BigDecimal(96), actual);
    }

    @Test
    public void testDay5() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(5);
        assertEquals(new BigDecimal(600), actual);
    }

    @Test
    public void testDay6() {
        BigDecimal actual = creditCardFakeGenerator.generateFakeNumber(6);
        assertEquals(new BigDecimal(4320), actual);
    }

}