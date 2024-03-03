package pl.commitow.piotr.obolewicz.abstractFactory.interfaces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {

        KingdomFactory kingdomFactory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF);

        Castle elfCastle = kingdomFactory.createCastle();
        King elfKing = kingdomFactory.createKing();
        log.info(elfCastle.getDescription());
        log.info(elfKing.getDescription());

        kingdomFactory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORK);

        Castle orkCastle = kingdomFactory.createCastle();
        King orkKing = kingdomFactory.createKing();
        log.info(orkCastle.getDescription());
        log.info(orkKing.getDescription());

    }
}
