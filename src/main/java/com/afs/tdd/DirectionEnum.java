package com.afs.tdd;

public enum DirectionEnum {
    N,E,S,W;
    private static final DirectionEnum[] vals = values();

    public DirectionEnum next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }
    public DirectionEnum previous() {
        final int previousOrdinal = (this.ordinal() - 1);
        return vals[previousOrdinal < 0 ? vals.length-1 : previousOrdinal];
    }
}
