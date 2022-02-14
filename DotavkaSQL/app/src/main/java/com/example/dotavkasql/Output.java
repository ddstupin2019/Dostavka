package com.example.dotavkasql;

public class Output {
    int KoleT,LongT,KprD,KoleF,KprF,ProfinTD, _ID;
    String town;

    public Output(int koleT, int longT, int kprD, int koleF, int kprF, int profinTD, String town) {
        KoleT = koleT;
        LongT = longT;
        KprD = kprD;
        KoleF = koleF;
        KprF = kprF;
        ProfinTD = profinTD;
        this.town = town;
    }

    public  Output(){}
}
