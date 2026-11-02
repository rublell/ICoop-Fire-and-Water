package icoop.actor;

public interface ElementalEntity {

    /**
     * énumération des types d'élément
     */
    public enum Element {
        WATER, FIRE, PHYSIQUE;
    }

    Element getElement();
}
