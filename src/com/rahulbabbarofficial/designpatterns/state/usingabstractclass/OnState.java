package com.rahulbabbarofficial.designpatterns.state.usingabstractclass;

public class OnState extends State{

  @Override
  public void onOff(Tv tv){
    tv.setState(new OffState());
    super.onOff(tv);
  }

  @Override
  public void volumneUp(Tv tv){
    if(tv.isOn()) {
      tv.setVolumne(tv.getVolumne()+1);
      System.out.println("Volume Up : " + tv.getVolumne());
    }
  }

  @Override
  public void volumeDown(Tv tv){
    if(tv.isOn()) {
      tv.setVolumne(tv.getVolumne()-1);
      System.out.println("Volume Down : " + tv.getVolumne());
    }
  }

  @Override
  public void changeChannel(Tv tv, int channelNo){
    if(tv.isOn()) {
      tv.setChannel(channelNo);
      System.out.println("switched to channel No : " + tv.getChannel());
    }
  }
}
