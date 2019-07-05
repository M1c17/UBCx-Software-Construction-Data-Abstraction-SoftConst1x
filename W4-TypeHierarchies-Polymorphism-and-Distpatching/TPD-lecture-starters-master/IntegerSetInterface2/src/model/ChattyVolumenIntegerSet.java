package model;

public class ChattyVolumenIntegerSet extends HighVolumeIntegerSet {

  @Override
  public void insert(Integer num) {
    //data.add(num)
    super.insert(num);
    System.out.println("Here is your insert num:" + data);

  }
}

