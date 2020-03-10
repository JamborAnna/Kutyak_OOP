package com.company;

public class KutyaFajta {
    private int id;
    private String nev;
    private String eredetiNev;

    public   KutyaFajta(String sor){
        String[] st= sor.split(";");
        this.id=Integer.parseInt(st[0]);
        this.nev=st[1];
        this.eredetiNev="";
        if (st.length>2){
            this.eredetiNev=st[2];
        }

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

    public String getEredetiNev() {
        return eredetiNev;
    }

    public void setEredetiNev(String eredetiNev) {
        this.eredetiNev = eredetiNev;
    }

    @Override
    public String toString() {
        return "KutyaFajta{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", eredetiNev='" + eredetiNev + '\'' +
                '}';
    }
}
