package com.rahulbabbarofficial.designpatterns.state.usingabstractclass;

public class OffState extends State{

  public void onOff(Tv tv){
    tv.setState(new OnState());
    super.onOff(tv);
  }

}
