package com.rahulbabbarofficial.designpatterns.state.usinginterface;

public class OnState implements TvState{

  @Override
  public int volumeUp(Tv tv) {
    tv.setVolume(tv.getVolume()+1);
    System.out.println("Volume Up: "+ tv.getVolume());
    return tv.getVolume();
  }

  @Override
  public int volumeDown(Tv tv) {
    tv.setVolume(tv.getVolume()-1);
    System.out.println("Volume Down: "+ tv.getVolume());
    return tv.getVolume();
  }

  @Override
  public int onOffButton(Tv tv) {
    if(tv.getState() instanceof OffState){
      tv.setState(new OnState());
      System.out.println("Tv On");
    }else{
      tv.setState(new OffState());
      System.out.println("Tv Off");
    }
    return 0;
  }

  @Override
  public int changeChannel(Tv tv, int channelNo) {
    tv.setChannel(channelNo);
    System.out.println("channel switched to "+ tv.getChannel());
    return 0;
  }
}