package com.rahulbabbarofficial.designpatterns.state.usingabstractclass;

public abstract class State {

  void onOff(Tv tv){
    tv.isOn();
    tv.setOn(!tv.isOn());
    tv.setVolumne(tv.isOn() ? 10 : 0);
    System.out.println("Tv is " + (tv.isOn() ? "On" : "Off"));
  }

  public void volumneUp(Tv tv){}

  public void volumeDown(Tv tv){}

  public void changeChannel(Tv tv, int channelNo){}
}
