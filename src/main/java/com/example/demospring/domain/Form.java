package com.example.demospring.domain;

/**
 * @author diao 2021/2/9
 */
public class Form {
    private String orderNumber;
    private String lineNumber;
    private String nh;
    private String itemNumber;
    private String 开始日期;

    public String get开始日期() {
        return 开始日期;
    }

    public void set开始日期(String 开始日期) {
        this.开始日期 = 开始日期;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

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
