package com.company;

public class KutyaNev {
    private int id;
    private String nev;
    public KutyaNev(String sor){
        String[] st=sor.split(";");
        this.id=Integer.parseInt(st[0]);
        this.nev=st[1];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "KutyaNevek{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                '}';
    }
}
