package com.example.demospring.domain;

/**
 * @author diao 2021/2/9
 */
public class Form {
    private String orderNumber;
    private String lineNumber;
    private String nh;
    private String expr1;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getNh() {
        return nh;
    }

    public void setNh(String nh) {
        this.nh = nh;
    }

    @Override
    public String toString() {
        return "Form{" +
                "orderNumber='" + orderNumber + '\'' +
                ", lineNumber='" + lineNumber + '\'' +
                ", nh='" + nh + '\'' +
                '}';
    }
}
