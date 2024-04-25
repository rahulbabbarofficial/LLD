package com.rahulbabbarofficial.designpatterns.state.usingabstractclass;

public class Tv extends State{

  private int volumne;
  private int channel;
  private boolean isOn;
  State state = new OffState();

  void onOff(){
    state.onOff(this);
  }

  void volumneUp(){
    state.volumneUp(this);
  }

  void volumeDown(){
   state.volumeDown(this);
  }

  void changeChannel(int channelNo){
    state.changeChannel(this, channelNo);
  }

  public int getVolumne() {
    return volumne;
  }

  public void setVolumne(int volumne) {
    this.volumne = volumne;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isOn() {
    return isOn;
  }

  public void setOn(boolean on) {
    isOn = on;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}
