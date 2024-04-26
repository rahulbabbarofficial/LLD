package com.rahulbabbarofficial.designpatterns.composite.solution.usinginterface;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

  private String name;
  private List<FileSystem> files = new ArrayList<>();

  Directory(String name) {
    this.name = name;
  }

  @Override
  public void ls() {
    System.out.println("Directory : " + this.name);
    for (FileSystem file : files) {
      file.ls();
    }
  }

  public void add(FileSystem obj) {
    files.add(obj);
  }
}
