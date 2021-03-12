class gdtd {
  public static void main (String[] args) {
    gd one = new gd();
    one.setSize(70);
    gd two = new gd();
    two.setSize(8);
    System.out.println("First dog: " + one.getSize());
    System.out.println("Second dog: " + two.getSize());
    one.bark();
    two.bark();
    }
  }