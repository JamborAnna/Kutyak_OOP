package com.company;

import java.util.Date;

public class Kutya {
    private int id;
    private int fajta_id;
    private int new_id;
    private int eletkor;
    private Date orvosiEll;

    public Kutya(String sor){
        String[] st= sor.split(";");
        this.id=Integer.parseInt(st[0]);
        this.fajta_id=Integer.parseInt(st[1]);
        this.new_id=Integer.parseInt(st[2]);
        this.eletkor=Integer.parseInt(st[3]);
        String[] datum=st[4].split("\\.");
        this.orvosiEll=new Date(Integer.parseInt(datum[0]),Integer.parseInt(datum[1]),Integer.parseInt(datum[2]));


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFajta_id() {
        return fajta_id;
    }

    public void setFajta_id(int fajta_id) {
        this.fajta_id = fajta_id;
    }

    public int getNew_id() {
        return new_id;
    }

    public void setNew_id(int new_id) {
        this.new_id = new_id;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public Date getOrvosiEll() {
        return orvosiEll;
    }

    public void setOrvosiEll(Date orvosiEll) {
        this.orvosiEll = orvosiEll;
    }

    @Override
    public String toString() {
        return "Kutya{" +
                "id=" + id +
                ", fajta_id=" + fajta_id +
                ", new_id=" + new_id +
                ", eletkor=" + eletkor +
                ", orvosiEll=" + orvosiEll +
                '}';
    }
}
