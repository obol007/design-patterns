package pl.commitow.piotr.obolewicz.abstractFactory.interfaces;

public class OrcKingdomFactory implements KingdomFactory {

  @Override
  public Castle createCastle() {
    return new OrkCastle();
  }

  @Override
  public King createKing() {
    return new OrkKing();
  }
}