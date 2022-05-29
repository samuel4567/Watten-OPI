package model;

public enum Schlog {
    SIEBMER(7),
    OCHTER(8),
    NEINER(9),
    ZEHNER(10),
    UNTER(11),
    OBER(12),
    KINIG(13),
    ASS(14),
    WELLI(5);
    private int numVal;

    Schlog(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    }
