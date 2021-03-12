class xcopy {
  public static void main(String [] args) {
    int b = 42;
    xcopy x = new xcopy();
    int y = x.go(b);
    System.out.println(b + " " + y);
  }
  int go(int a) {
    a = a * 2;
    return a;
  }
}