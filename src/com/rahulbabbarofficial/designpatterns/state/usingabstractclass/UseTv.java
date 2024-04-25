package com.rahulbabbarofficial.designpatterns.state.usingabstractclass;

public class UseTv {

  public static void main(String[] args) {
    Tv tv = new Tv();
    tv.onOff();
    tv.volumneUp();
    tv.volumeDown();
    tv.onOff();
    tv.volumneUp();
    tv.volumeDown();
  }
}
