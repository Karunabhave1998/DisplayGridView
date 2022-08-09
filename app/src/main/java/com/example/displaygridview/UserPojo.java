package com.example.displaygridview;

public class UserPojo {
    int empImage;
    String empid;
    String empname;
    String empsal;
    String empDesignation;


    public int getEmpImage() {
        return empImage;
    }

    public void setEmpImage(int empImage) {
        this.empImage = empImage;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsal() {
        return empsal;
    }

    public void setEmpsal(String empsal) {
        this.empsal = empsal;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }



    public UserPojo(int empImage, String empid, String empname, String empsal, String empDesignation) {
        this.empImage = empImage;
        this.empid = empid;
        this.empname = empname;
        this.empsal = empsal;
        this.empDesignation = empDesignation;
    }




}
