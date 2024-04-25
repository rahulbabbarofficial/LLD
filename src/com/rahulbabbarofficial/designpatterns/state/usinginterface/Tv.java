package com.rahulbabbarofficial.designpatterns.state.usinginterface;

public class Tv implements TvState{
  TvState state = new OffState();
  int volume = 10;
  int channel = 1;

  @Override
  public int volumeUp(Tv tv) {
    return state.volumeUp(tv);
  }

  @Override
  public int volumeDown(Tv tv) {
    return state.volumeDown(tv);
  }

  @Override
  public int onOffButton(Tv tv) {
    return state.onOffButton(tv);
  }

  @Override
  public int changeChannel(Tv tv, int channelNo) {
    return state.changeChannel(tv,channelNo);
  }

  public TvState getState() {
    return state;
  }

  public void setState(TvState state) {
    this.state = state;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }
}
