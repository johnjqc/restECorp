package com.jsoft.restecorp.service;

import com.jsoft.restecorp.service.impl.CreditCardFakeGenerator;

import java.math.BigDecimal;

/**
 * The interface for {@link CreditCardFakeGenerator}
 *
 * @author <a href="johnquirogac@gmail.com">John Quiroga</a>
 * @since 0.0.1
 */
public interface ICreditCardFakeGenerator {

    /**
     * Generate number of credit card fake with number day of month
     * @param dayOfMonth day to generate fake number credit card
     * @return Number of credit card fake
     */
    BigDecimal generateFakeNumber(Integer dayOfMonth);
}
