package com.jvlatrille.personnage;

public class Personnage {

    public enum Orientation { NORD, EST, SUD, OUEST }

    private Orientation orientation = Orientation.NORD;

    /** Orientation courante du personnage */
    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        if (fois < 0) throw new IllegalArgumentException("fois doit être >= 0");
        int idx = switch (orientation) {
            case NORD -> 0;
            case EST  -> 1;
            case SUD  -> 2;
            case OUEST-> 3;
        };
        int next = (idx + (fois % 4)) % 4;
        orientation = switch (next) {
            case 0 -> Orientation.NORD;
            case 1 -> Orientation.EST;
            case 2 -> Orientation.SUD;
            default -> Orientation.OUEST;
        };
        return orientation;
    }
}
