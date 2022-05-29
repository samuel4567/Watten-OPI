package model;

public class Card {
    private Schlog schlog;
    private Forbe forbe;



    public boolean equals(Card o){
        return this.getSchlog()==o.getSchlog() && this.getForbe()==o.getForbe();
    }

    public Schlog getSchlog() {
        return schlog;
    }

    public void setSchlog(Schlog schlog) {
        this.schlog = schlog;
    }

    public Forbe getForbe() {
        return forbe;
    }

    public void setForbe(Forbe forbe) {
        this.forbe = forbe;
    }
}
