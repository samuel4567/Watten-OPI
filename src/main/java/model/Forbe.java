package model;

import javax.crypto.spec.OAEPParameterSpec;

public enum Forbe {
    HERZ(3),
    EICHEL(1),
    SCHELL(2),
    LAAB(0);
    private int numVal;

    Forbe(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    public static Forbe getNameByValue(int i) {
        switch (i) {
            case 0:
                return LAAB;
            case 1:
                return EICHEL;
            case 2:
                return SCHELL;
            case 3:
                return HERZ;

        }
        return null;
    }
    }
