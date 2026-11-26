package com.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InvoiceCalculatorTest {

  private final InvoiceCalculator calculator = new InvoiceCalculator();

  @Test
  void adds_the_vat_to_the_net_price_of_every_unit() {
    assertEquals(242.0, calculator.total(100.0, 2), 0.001);
  }

  @Test
  void rejects_a_quantity_that_is_not_positive() {
    assertThrows(IllegalArgumentException.class, () -> calculator.total(100.0, 0));
  }
}
