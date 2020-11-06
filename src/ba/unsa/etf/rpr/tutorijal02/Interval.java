package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    double pocetnaTacka;
    double krajnjaTacka;
    boolean pripadnostPocetne;
    boolean pripadnostKrajnje;

    public double getPocetnaTacka() {
        return pocetnaTacka;
    }

    public void setPocetnaTacka(double pocetnaTacka) {
        this.pocetnaTacka = pocetnaTacka;
    }

    public double getKrajnjaTacka() {
        return krajnjaTacka;
    }

    public void setKrajnjaTacka(double krajnjaTacka) {
        this.krajnjaTacka = krajnjaTacka;
    }

    public boolean isPripadnostPocetne() {
        return pripadnostPocetne;
    }

    public void setPripadnostPocetne(boolean pripadnostPocetne) {
        this.pripadnostPocetne = pripadnostPocetne;
    }

    public boolean isPripadnostKrajnje() {
        return pripadnostKrajnje;
    }

    public void setPripadnostKrajnje(boolean pripadnostKrajnje) {
        this.pripadnostKrajnje = pripadnostKrajnje;
    }

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pripadnostPocetne, boolean pripadnostKrajnje) {
        if(pocetnaTacka>krajnjaTacka) throw new IllegalArgumentException();

        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pripadnostPocetne = pripadnostPocetne;
        this.pripadnostKrajnje = pripadnostKrajnje;
    }

    public Interval() {
        pocetnaTacka = 0;
        krajnjaTacka = 0;
        pripadnostPocetne = false;
        pripadnostKrajnje = false;
    }

    public static Interval intersect(Interval interval1, Interval interval2) {


        return null;
    }


    @Override
    public String toString() {
        String ispis = "";
        if(pocetnaTacka==0 && krajnjaTacka==0) {
            return "()";
        }
        else if(pripadnostPocetne==true && pripadnostKrajnje == true) {
            return ispis + "[" + pocetnaTacka + "," + krajnjaTacka + "]";
        }
        else if(pripadnostPocetne==true && pripadnostKrajnje == false) {
            return ispis + "[" + pocetnaTacka + "," + krajnjaTacka + ")";
        }
        else if(pripadnostPocetne==false && pripadnostKrajnje == true) {
            return ispis + "(" + pocetnaTacka + "," + krajnjaTacka + "]";
        }
        else {
            return ispis + "(" + pocetnaTacka + "," + krajnjaTacka + ")";
        }



    }

    public boolean isIn(double tacka) {
        if(tacka<krajnjaTacka && tacka>pocetnaTacka) {
            return true;

        }
        if(tacka == pocetnaTacka && pripadnostPocetne == true)
            return true;
        else if(tacka == krajnjaTacka && pripadnostKrajnje == true)
            return true;

        return false;

    }

    public boolean isNull() {
        if(pocetnaTacka==krajnjaTacka && pripadnostPocetne==false && pripadnostKrajnje == false)
        return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetnaTacka, pocetnaTacka) == 0 &&
                Double.compare(interval.krajnjaTacka, krajnjaTacka) == 0 &&
                pripadnostPocetne == interval.pripadnostPocetne &&
                pripadnostKrajnje == interval.pripadnostKrajnje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pocetnaTacka, krajnjaTacka, pripadnostPocetne, pripadnostKrajnje);
    }

    public Interval intersect(Interval interval) {
       

        return null;
    }
}
