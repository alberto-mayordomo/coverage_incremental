package com.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountServiceTest {

  @Test
  void a_regular_price_has_no_discount() {
    assertEquals(50.0, new DiscountService().price(50.0, false, false));
  }

  @Test
  void a_vip_gets_ten_percent_off() {
    assertEquals(90.0, new DiscountService().price(100.0, true, false), 0.001);
  }
}
