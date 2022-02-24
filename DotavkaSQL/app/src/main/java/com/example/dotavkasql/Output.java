package com.example.dotavkasql;

public class Output {
    int KoleT,LongT,KprD,KoleF,KprF,ProfinTD, _ID;
    String town;
Integer date=null;
    public Output(int koleT, int longT, int kprD, int koleF, int kprF, int profinTD, String town) {
        KoleT = koleT;
        LongT = longT;
        KprD = kprD;
        KoleF = koleF;
        KprF = kprF;
        ProfinTD = profinTD;
        this.town = town;
    }
    public Output(int koleT, int longT, int kprD, int koleF, int kprF, int profinTD, String town, Integer date) {
        KoleT = koleT;
        LongT = longT;
        KprD = kprD;
        KoleF = koleF;
        KprF = kprF;
        ProfinTD = profinTD;
        this.town = town;
        this.date=date;
    }

    public  Output(){}

    @Override
    public String toString() {
        return "Output{" +
                "KoleT=" + KoleT +
                ", LongT=" + LongT +
                ", KprD=" + KprD +
                ", KoleF=" + KoleF +
                ", KprF=" + KprF +
                ", ProfinTD=" + ProfinTD +
                ", _ID=" + _ID +
                ", town='" + town + '\'' +
                date+
                '}';
    }

    public void setTown(String town) {
        this.town = town;
    }
    public void setDate(Integer date) { this.date = date; }
}
