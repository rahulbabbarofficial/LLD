package com.rahulbabbarofficial.designpatterns.composite.solution.usingabstractclass;

public class File extends FileSystem{

  File(String name){
    super(name);
  }

  public void ls(){
    System.out.println("File : "+ super.getName());
  }

}
