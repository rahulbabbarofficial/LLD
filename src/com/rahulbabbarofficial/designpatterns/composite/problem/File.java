package com.rahulbabbarofficial.designpatterns.composite.problem;

public class File {

  private String name;
  File(String name){
    this.name = name;
  }

  public void ls(){
    System.out.println("File : "+ name);
  }

}
