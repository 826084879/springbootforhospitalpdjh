package com.hospital.theforth.bean;

public class Department {
    private int departId;
    private String departName;
    private int parentDepartId;
    private String parentDepartName;
    private int departLevel;

    @Override
    public String toString() {
        return "Department{" +
                "departId=" + departId +
                ", departName='" + departName + '\'' +
                ", parentDepartId=" + parentDepartId +
                ", parentDepartName='" + parentDepartName + '\'' +
                ", departLevel=" + departLevel +
                '}';
    }

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public int getParentDepartId() {
        return parentDepartId;
    }

    public void setParentDepartId(int parentDepartId) {
        this.parentDepartId = parentDepartId;
    }

    public String getParentDepartName() {
        return parentDepartName;
    }

    public void setParentDepartName(String parentDepartName) {
        this.parentDepartName = parentDepartName;
    }

    public int getDepartLevel() {
        return departLevel;
    }

    public void setDepartLevel(int departLevel) {
        this.departLevel = departLevel;
    }
}
