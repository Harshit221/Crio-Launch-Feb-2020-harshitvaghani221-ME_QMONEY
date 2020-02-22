package com.crio.warmup.stock;

public class Trade {

  String sybmol;
  int quantity;
  String tradeType;
  String purchaseDate;

  public Trade() {
  }

  public Trade(String sybmol, int quantity, String tradeType, String purchaseDate) {
    this.sybmol = sybmol;
    this.quantity = quantity;
    this.tradeType = tradeType;
    this.purchaseDate = purchaseDate;
  }

  public String getSybmol() {
    return sybmol;
  }

  public void setSybmol(String sybmol) {
    this.sybmol = sybmol;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getTradeType() {
    return tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

}
