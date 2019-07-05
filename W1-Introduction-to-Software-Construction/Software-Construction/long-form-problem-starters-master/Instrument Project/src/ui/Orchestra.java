package ui;

import model.BrassInstrument;
import model.StringInstrument;

import java.util.ArrayList;

public class Orchestra {

  private ArrayList<BrassInstrument> brassInstruments;
  private ArrayList<StringInstrument> stringInstruments;

  public Orchestra(){
    brassInstruments = new ArrayList<>();
    stringInstruments = new ArrayList<>();

  }

  public void addBrassInstrument(BrassInstrument brassInstrument) {
    if(!brassInstruments.contains(brassInstrument)) {
      brassInstruments.add(brassInstrument);
      brassInstrument.setOrchestra(this);
    }

  }

  public void addStringInstrument(StringInstrument stringInstrument) {
    if(!stringInstruments.contains(stringInstrument)) {
      stringInstruments.add(stringInstrument);
      stringInstrument.setOrchestra(this);
    }

  }


}

