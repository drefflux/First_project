class Dktd {
  public static void main(String[] args) {
    Dk d = new Dk();
    d.snare = false;
    d.playSnare();
    d.playTopHat();
    if (d.snare == true) 
      d.playSnare();
    }
  }