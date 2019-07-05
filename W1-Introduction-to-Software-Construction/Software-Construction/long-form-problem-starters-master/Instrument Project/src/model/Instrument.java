package model;

import ui.Orchestra;

public interface Instrument {

  //EFFECTS: add instrument to the orchestra
  void setOrchestra(Orchestra orchestra);
  //EFFECTS: remove instrument to the orchestra
  void removeInstrument();
  // EFFECTS: print out the inventory to the instruments
  void inventoryInstruments();

}
