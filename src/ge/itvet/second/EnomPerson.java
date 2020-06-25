package ge.itvet.second;

public enum EnomPerson {
    name(1),
    surname(2),
    city(3);
    public int myOrdinal;
    EnomPerson(int myOrdinal) {
        this.myOrdinal = myOrdinal;
    }

    public int getMyOrdinal() {
        return myOrdinal;
    }
}
