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

    public static Schlog getNameByValue(int i) {
        switch (i) {
            case 7:
                return SIEBMER;
            case 8:
                return OCHTER;
            case 9:
                return NEINER;
            case 10:
                return ZEHNER;
            case 11:
                return UNTER;
            case 12:
                return OBER;
            case 13:
                return KINIG;
            case 14:
                return ASS;
                case 5:
            case 6:
                return WELLI;
        }
        return null;
    }
}
