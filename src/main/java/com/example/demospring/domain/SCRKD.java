package com.example.demospring.domain;

/**
 * @author diao 2021/2/18
 */
public class SCRKD {
    private String 入库日期;
    private String moNumber;
    private String moLineNumber;
    private String 物料代码;
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String get入库日期() {
        return 入库日期;
    }

    public void set入库日期(String 入库日期) {
        this.入库日期 = 入库日期;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

    public String getMoLineNumber() {
        return moLineNumber;
    }

    public void setMoLineNumber(String moLineNumber) {
        this.moLineNumber = moLineNumber;
    }

    public String get物料代码() {
        return 物料代码;
    }

    public void set物料代码(String 物料代码) {
        this.物料代码 = 物料代码;
    }

    @Override
    public String toString() {
        return "SCRKD{" +
                "入库日期='" + 入库日期 + '\'' +
                ", moNumber='" + moNumber + '\'' +
                ", moLineNumber='" + moLineNumber + '\'' +
                ", 物料代码='" + 物料代码 + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
