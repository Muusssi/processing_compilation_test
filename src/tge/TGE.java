package tge;

import processing.core.PApplet;

public class TGE {

  public static final String VERSION = "0.0.1";

  public static void show_tge_version() {
    System.out.println(VERSION);
  }

  private static PApplet papplet;

  public static void init(PApplet papplet) {
    TGE.papplet = papplet;
  }

  public static PApplet papplet() {
    if (TGE.papplet == null) {
      System.err.println("ERROR: The game engine was not initialized.");
      System.err.println("Execute: 'TGE.init(this);' in the begining setup().");
      System.exit(1);
    }
    return TGE.papplet;
  }


}
