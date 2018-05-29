package com.jsoft.restecorp.service.impl;

import com.jsoft.restecorp.service.ICreditCardFakeGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * The service implementation for credit card fake generator
 *
 * @author <a href="johnquirogac@gmail.com">John Quiroga</a>
 * @since 0.0.1
 */
@Service
public class CreditCardFakeGenerator implements ICreditCardFakeGenerator {

    /**
     * The {@link CreditCardFakeGenerator} logger
     */
    private static final Logger logger = LoggerFactory.getLogger(CreditCardFakeGenerator.class);

    @Override
    public BigDecimal generateFakeNumber(Integer dayOfMonth) {
        logger.debug("Validate day of moth: {}", dayOfMonth);
        return new BigDecimal(dayOfMonth).multiply(factorial(new BigDecimal(dayOfMonth)));
    }

    private BigDecimal factorial (BigDecimal number) {
        if (number.equals(BigDecimal.ZERO))
            return BigDecimal.ONE;
        else
            return number.multiply(factorial(number.subtract(BigDecimal.ONE)));
    }
}
