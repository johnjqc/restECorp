package com.jsoft.restecorp.model.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@XmlRootElement(name = "creditCardFakeResponse")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CreditCardFakeResponse {

    /**
     * The specific Serial version UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * The number of fake credit card
     */
    private BigDecimal numberOfCreditCardFake;
}
