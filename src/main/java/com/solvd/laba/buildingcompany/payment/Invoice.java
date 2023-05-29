package com.solvd.laba.buildingcompany.payment;

import java.time.LocalDate;

public class Invoice implements IInvoice {
    private int invoiceNumber;
    private LocalDate dateIssued;
    private LocalDate dueDate;
    private double amountDue;
    private double totalPriceBeforeTax;
    private double taxAmount;
    private double totalPrice;

    public Invoice(int invoiceNumber, LocalDate dateIssued, LocalDate dueDate, double totalPriceBeforeTax, double taxAmount, double totalPrice){
        this.invoiceNumber = invoiceNumber;
        this.dateIssued = dateIssued;
        this.dueDate = dueDate;
        this.totalPriceBeforeTax = totalPriceBeforeTax;
        this.taxAmount = taxAmount;
        this.totalPrice = totalPrice;


    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getTotalPriceBeforeTax() {
        return amountDue;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalPrice() {
        return getTotalPriceBeforeTax() + getTaxAmount();
    }

    }


