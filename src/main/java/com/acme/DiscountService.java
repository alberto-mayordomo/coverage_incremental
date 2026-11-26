package com.acme;

public class DiscountService {

  public double price(double price, boolean vip, boolean blackFriday) {
    double result = price;
    if (vip) {
      result = result * 0.9;
    }
    if (blackFriday && price >= 100) {
      result = result - 20;
    }
    return result;
  }
}
