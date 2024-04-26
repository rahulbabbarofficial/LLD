package com.rahulbabbarofficial.designpatterns.composite.solution.usingabstractclass;

public abstract class FileSystem {

  private String name;

  FileSystem(String name) {
    this.name = name;
  }

  abstract public void ls();

  public String getName() {
    return this.name;
  }
}
