package com.hospital.theforth.bean;

public class Patient {
    private String name;
    private String visitNo;
    private int age;
    private String visitDate;
    private String clientNo;
    private int yyFlag;
    private int isArrived;
    private int videoFlag;
    private String phoneNum;
    private int haveGiveUp;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", visitNo='" + visitNo + '\'' +
                ", age=" + age +
                ", visitDate='" + visitDate + '\'' +
                ", clientNo='" + clientNo + '\'' +
                ", yyFlag=" + yyFlag +
                ", isArrived=" + isArrived +
                ", videoFlag=" + videoFlag +
                ", phoneNum='" + phoneNum + '\'' +
                ", haveGiveUp=" + haveGiveUp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public int getYyFlag() {
        return yyFlag;
    }

    public void setYyFlag(int yyFlag) {
        this.yyFlag = yyFlag;
    }

    public int getIsArrived() {
        return isArrived;
    }

    public void setIsArrived(int isArrived) {
        this.isArrived = isArrived;
    }

    public int getC_pd_id() {
        return videoFlag;
    }

    public void setC_pd_id(int videoFlag) {
        this.videoFlag = videoFlag;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getHaveGiveUp() {
        return haveGiveUp;
    }

    public void setHaveGiveUp(int haveGiveUp) {
        this.haveGiveUp = haveGiveUp;
    }
}
