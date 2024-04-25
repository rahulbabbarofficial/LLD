package com.rahulbabbarofficial.designpatterns.state.usinginterface;

public interface TvState {
  int volumeUp(Tv tv);
  int volumeDown(Tv tv);
  int onOffButton(Tv tv);
  int changeChannel(Tv tv, int channelNo);
}

