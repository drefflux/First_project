class gd {
  int size;
  public int getSize() {
    return size;
    }
  public void setSize(int s) {
    size = s;
    }
  void bark() {
    if (size>60) {
      System.out.println("Gav-Gav"); 
      }
    else 
      if (size>14) {
        System.out.println("vuf-Vuf");
        }
      else {
        System.out.println("Taf-Taf");
      }
    }
  }