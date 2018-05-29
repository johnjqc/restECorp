package com.jsoft.restecorp.controller;

import com.jsoft.restecorp.model.web.CreditCardFakeResponse;
import com.jsoft.restecorp.service.ICreditCardFakeGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

@Controller
@RequestMapping(path = "/creditCard")
public class CreditCardController {

    /**
     * The {@link CreditCardController} logger
     */
    private static final Logger logger = LoggerFactory.getLogger(CreditCardController.class);

    @Autowired
    private ICreditCardFakeGenerator creditCardFakeGenerator;

    @RequestMapping(value = "/fakeGenerator/{dayOfMonth}", method = RequestMethod.GET)
    public ResponseEntity<CreditCardFakeResponse> calculateCrediCardFake(@PathVariable("dayOfMonth") Integer dayOfMonth) {
        CreditCardFakeResponse apiResponse = new CreditCardFakeResponse();
        ResponseEntity<CreditCardFakeResponse> httpResponse = new ResponseEntity<>(apiResponse, HttpStatus.OK);

        BigDecimal result = creditCardFakeGenerator.generateFakeNumber(dayOfMonth);

        logger.debug("The credit card fake generated is: {}", result);

        apiResponse.setNumberOfCreditCardFake(result);

        return httpResponse;
    }

}
