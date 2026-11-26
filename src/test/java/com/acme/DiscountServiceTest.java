package com.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountServiceTest {

  @Test
  void a_regular_price_has_no_discount() {
    assertEquals(50.0, new DiscountService().price(50.0, false, false));
  }
}
