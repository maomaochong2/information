package com.example.demo.entity;

public class ClassInfo {

    private Integer id;
    private String cname;
    private String cdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", cdesc='" + cdesc + '\'' +
                '}';
    }
}
