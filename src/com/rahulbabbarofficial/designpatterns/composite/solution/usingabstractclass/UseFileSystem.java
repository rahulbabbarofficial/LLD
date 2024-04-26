package com.rahulbabbarofficial.designpatterns.composite.solution.usingabstractclass;

public class UseFileSystem {

  public static void main(String[] args) {
    Directory d = new Directory("C:");
    d.add(new File("file1"));
    d.add(new File("file2"));
    d.add(new Directory("dir1"));

//    d.add("file"); // if i would add this object, compiletime error occurs
    d.ls();

  }
}
