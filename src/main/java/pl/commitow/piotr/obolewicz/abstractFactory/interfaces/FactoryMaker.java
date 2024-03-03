package pl.commitow.piotr.obolewicz.abstractFactory.interfaces;

public class FactoryMaker {

    public enum KingdomType {
        ELF, ORK
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        KingdomFactory kingdomFactory = null;
        switch (type) {
            case ELF:
                kingdomFactory = new ElfKingdomFactory();
                break;
            case ORK:
                kingdomFactory = new OrcKingdomFactory();
                break;
        }
        return kingdomFactory;
    }
}
