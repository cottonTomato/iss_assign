public class Lesson3 {
  public static void main(String[] args) {
    int x = 10;

    // If block are used for conditional flow of program
    if (x > 5) System.out.println("Big");

    // For block is used for looping or iterating over a collection
    for (int i = 0; i < 3; i++) System.out.println(i);

    int j = 0;
    // While block are used for conditional looping
    while (j < 3) j++;

    int k = 0;
    // Do-while loop execute the inner block at least once
    do {
      k++;
    } while (k < 10);

    int y = 10;
    while (y < 20) {
      if (y == 15) {
        break; // break is used to end the loop prematurely
      }
      System.out.print("value of x : " + y);
      y++;
      System.out.print("\n");
    }

    int z = 10;
    while (z < 20) {
      z++;
      if (z == 15) {
        continue; // continue is used to skip over one iteration
      }
      System.out.print("value of x : " + z);
      System.out.print("\n");
    }
  }
}
