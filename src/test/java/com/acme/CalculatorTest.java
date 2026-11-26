package com.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  void adds() {
    assertEquals(5, calculator.add(2, 3));
  }

  @Test
  void divides() {
    assertEquals(2, calculator.divide(6, 3));
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
  }
}
