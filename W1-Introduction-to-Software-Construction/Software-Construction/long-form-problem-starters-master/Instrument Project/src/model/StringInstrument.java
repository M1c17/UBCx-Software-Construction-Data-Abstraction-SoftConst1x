package model;

import ui.Orchestra;

import java.util.Objects;

public abstract class StringInstrument implements Instrument{
  private String musician;
  private String type;
  private Orchestra orchestra;

  public StringInstrument(Orchestra orchestra, String musician, String type) {
    this.musician = musician;
    this.type = type;
    this.orchestra = orchestra;
  }

  @Override
  public void setOrchestra(Orchestra orchestra) {
    if(!this.orchestra.equals(orchestra)) {
      this.orchestra = orchestra;
      orchestra.addStringInstrument(this);
    }
  }


  @Override
  public void removeInstrument() {

  }

  @Override
  public void inventoryInstruments() {

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof StringInstrument)) return false;
    StringInstrument that = (StringInstrument) o;
    return orchestra.equals(that.orchestra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orchestra);
  }
}
