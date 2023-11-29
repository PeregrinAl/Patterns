package MyAdapter;

public class Meat {
    public PFC compound;
    public MeatKinds kind;
    Meat(MeatKinds kind, PFC pfc) {
        this.kind = kind;
        this.compound = pfc;
    }

    @Override
    public String toString() {
        if (kind == MeatKinds.bear) {
            return " bear ";
        }
        else if (kind == MeatKinds.wolf) {
            return " wolf ";
        }
        else return " fly ";
    }
}
