package com.rahulbabbarofficial.designpatterns.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {

  String name;
  List<Object> files = new ArrayList<>();
  Directory(String name){
    this.name = name;
  }

  public void ls(){
    System.out.println("Directory : " + name);
    for(Object file : files) {
      if(file instanceof Directory){
        ((Directory)file).ls();
      }else {
        ((File)file).ls();
      }
    }
  }

  public void add(Object obj){
    files.add(obj);
  }
}
