class clocktest {
  public static void main(String [] args) {
    clock c = new clock();
    String tod = c.setTime("1245");
    System.out.println("time: " + tod);
  }
}
class clock {
  String time;
  String setTime(String t) {
    time = t;
    return time;
  }
}