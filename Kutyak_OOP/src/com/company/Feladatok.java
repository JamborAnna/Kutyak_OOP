package com.company;

import java.io.File;
import java.util.*;

public class Feladatok {
    private ArrayList<Kutya>kutyak;
    private ArrayList<KutyaFajta>kutyaFajtak;
    private ArrayList<KutyaNev>kutyaNevek;

    public Feladatok(){
        Beolvasas();
        KutyaNevekSzama();
        HatosFeladat();
        HetesFeladat();
        NyolcasFeladat();
        KilencesFeladat();
    }
    private  void Beolvasas(){
        try{
            Scanner sc= new Scanner(new File("Kutyak.csv"));
            Scanner sc1= new Scanner(new File("KutyaNevek.csv"));
            Scanner sc2= new Scanner(new File("KutyaFajtak.csv"));

            kutyak= new ArrayList<>();
            kutyaFajtak= new ArrayList<>();
            kutyaNevek= new ArrayList<>();
            sc.nextLine();
            while (sc.hasNext()){
                kutyak.add(new Kutya(sc.nextLine()));
            }
            sc1.nextLine();
            while (sc1.hasNext()){
                kutyaNevek.add(new KutyaNev(sc1.nextLine()));
            }
            sc2.nextLine();
            while (sc2.hasNext()){
                kutyaFajtak.add(new KutyaFajta(sc2.nextLine()));
            }
            for(Kutya k: kutyak){
                System.out.println(k);
            }
            for(KutyaNev item: kutyaNevek){
                System.out.println(item);
            }
            for(KutyaFajta item: kutyaFajtak){
                System.out.println(item);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
    private void KutyaNevekSzama(){
        System.out.println("A kutyanevek szama:"+kutyaNevek.size());
    }
    private void HatosFeladat(){
        double ossz=0;
        for (Kutya item:kutyak)
              {
                  ossz+= item.getEletkor();
                  System.out.printf("6. Feladat. A kutyak atlagos életkora: %.2f",ossz/kutyak.size());
        }
    }
    private void HetesFeladat(){
        int maxIndex=0;
        for (int i=0; i<kutyak.size();i++){
            if (kutyak.get(i).getEletkor()>kutyak.get(maxIndex).getEletkor());
            {
                maxIndex=i;
            }
        }
        System.out.println("7. Feladat: A legidősebb kutya neve: "+KutyaNevKereses(kutyak.get(maxIndex).getNew_id())+
                "fajtája:"+KutyaFajtaKereses(kutyak.get(maxIndex).getFajta_id()));
    }
    private String KutyaNevKereses(int id){
        int i=0;
        while (i<kutyaNevek.size()&& kutyaNevek.get(i).getId()==id){
            i++;
        }
        return kutyaNevek.get(i).getNev();
    }
    private String KutyaFajtaKereses(int id){
        int i=0;
        while (i<kutyaFajtak.size()&& kutyaFajtak.get(i).getId()!=id){
            i++;
        }
        return kutyaFajtak.get(i).getNev();
    }

    private void NyolcasFeladat(){
        HashMap<Integer,Integer>stat=new HashMap<>();
        Date nap= new Date(2018,01,10);
        for (Kutya item:kutyak) {
            if (item.getOrvosiEll().equals(nap)){
                stat.putIfAbsent(item.getFajta_id(),0);
                stat.put(item.getFajta_id(),stat.get(item.getFajta_id())+1);
            }
        }
        System.out.println("8. Feladat, 2018.01.10-én vizsgált kutyafajták: ");
        for (Map.Entry entry:stat.entrySet()) {
            System.out.println("\t"+"-"+KutyaFajtaKereses((int)entry.getKey())+" "+entry.getValue()+" kutya");
        }

    }
    private  void KilencesFeladat(){
        HashMap<Date,Integer> stat= new HashMap<>();
        for (Kutya item: kutyak){
            stat.putIfAbsent(item.getOrvosiEll(),0);
            stat.put(item.getOrvosiEll(),stat.get(item.getOrvosiEll())+1);
        }
        for (Map.Entry <Date,Integer> entry: stat.entrySet()){
            System.out.println(entry);
        }

    }




}
