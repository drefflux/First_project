class dog {
  String name;
  public static void main (String[] args) {
    dog dog1 = new dog();
    dog1.bark();
    dog1.name = "Bart";

    dog[] mydog = new dog[3];
    mydog[0] = new dog();
    mydog[1] = new dog();
    mydog[2] = dog1;

    mydog[0].name = "Fred";
    mydog[1].name = "Sharik";

    System.out.println("Name of last dog is " + mydog[2].name);
    int x = 0;
    while (x<mydog.length){
      mydog[x].bark();
      x = x + 1;
      }
    }
  public void bark() {
    System.out.println(name + " Say Gav");
    }
  }