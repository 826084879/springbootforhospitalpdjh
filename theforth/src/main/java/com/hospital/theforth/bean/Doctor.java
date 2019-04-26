package com.hospital.theforth.bean;

import java.util.Date;

public class Doctor {
    private String docId;
    private String docName;
    private String docNumber;
    private int departId;
    private int postId;
    private String phoneNum;
    private String docIntroduce;
    private int gender;
//    private Date birthday;

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    public int getShowPatNum() {
        return showPatNum;
    }

    public void setShowPatNum(int showPatNum) {
        this.showPatNum = showPatNum;
    }

    private int showPatNum;

    @Override
    public String toString() {
        return "Doctor{" +
                "docId='" + docId + '\'' +
                ", docName='" + docName + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", deptId=" + departId +
                ", postId=" + postId +
                ", phoneNum='" + phoneNum + '\'' +
                ", docIntroduce='" + docIntroduce + '\'' +
                ", gender=" + gender +
//                ", birthday=" + birthday +
                '}';
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public int getDeptId() {
        return departId;
    }

    public void setDeptId(int deptId) {
        this.departId = departId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDocIntroduce() {
        return docIntroduce;
    }

    public void setDocIntroduce(String docIntroduce) {
        this.docIntroduce = docIntroduce;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

//    public Date getBirthday() {
//        return birthday;
//    }

//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
}
