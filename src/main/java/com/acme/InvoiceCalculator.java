package com.acme;

public class InvoiceCalculator {

  private static final double VAT = 0.21;

  public double total(double net, int quantity) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("quantity must be positive");
    }
    double subtotal = net * quantity;
    return subtotal + subtotal * VAT;
  }

  public double discount(double total, boolean loyalCustomer) {
    if (loyalCustomer && total > 500) {
      return total * 0.95;
    }
    return total;
  }
}
