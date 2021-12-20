public class Main{
  String s = "lkswegosehoiewgh. This is a sentence/String";
  // Poop
  /* 
   * Poop
   *
   *bekjfuef
   *lfefewioef
   *
  */
  String q = "Rafe is dumb and doesn't have the new chromebook";

  Integer i = 1;

  char c = 'a';

  float f = 90.9111111f;
  double d = 90.9999d;

  short u = 90;
  long l = 9;

  public static void main(String[] args) {
    Main m = new Main();
    System.out.print("Poop Kek>> ");
    System.out.println("Kyle's a dumbass");

    System.out.println(m.i - 10);

    System.out.println(m.f);

    m.i = 9999;

    if (m.i < 1000000) {
      System.out.println(m.q);
      System.out.println(m.f);
      System.out.println(m.d);
      System.out.println(m.u);
      System.out.println(m.l);
      System.out.println(m.s);
    }

    if (m.i > 10 || m.c != 'b') {
      System.out.println(m.s);
      System.out.println(m.i.toString());
      System.out.println(m.c);
    }
  }
}