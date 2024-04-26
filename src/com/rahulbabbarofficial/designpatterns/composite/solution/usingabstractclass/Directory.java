package com.rahulbabbarofficial.designpatterns.composite.solution.usingabstractclass;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {

  private List<FileSystem> files = new ArrayList<>();

  Directory(String name) {
    super(name);
  }

  @Override
  public void ls() {
    System.out.println("Directory : " + super.getName());
    for (FileSystem file : files) {
      file.ls();
    }
  }

  public void add(FileSystem obj) {
    files.add(obj);
  }
}
