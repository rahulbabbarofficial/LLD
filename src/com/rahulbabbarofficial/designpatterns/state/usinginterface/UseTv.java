package com.rahulbabbarofficial.designpatterns.state.usinginterface;

public class UseTv {

  public static void main(String[] args) {
    Tv tv = new Tv();
    tv.changeChannel(tv,3); // no operation performed
    tv.onOffButton(tv);
    tv.volumeDown(tv);
    tv.volumeDown(tv);
    tv.changeChannel(tv,20);
    tv.onOffButton(tv);
    tv.volumeDown(tv); // no operation performed
  }

}
