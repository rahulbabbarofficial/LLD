package com.rahulbabbarofficial.designpatterns.state.usinginterface;

public class OffState implements TvState{

  @Override
  public int volumeUp(Tv tv) {
    return 0;
  }

  @Override
  public int volumeDown(Tv tv) {
    return 0;
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
    return 0;
  }
}