package edu.cnm.deepdive;

public class Frobenius {
 
  /* pack sizes are 6, 9 and 20. */
  public static boolean isMcNugget(int value) {
    //TODO Return true if value can be expressed as the some of integral multiples (including multiplication
    // by zero) of the 3 original McNugget pack sizes; return false otherwise//

      if (value == 0) {
        return true;
      } else if (value < 0) {
        return false;
      }
      if (isMcNugget(value - 6) || isMcNugget(value - 9) || isMcNugget(value - 20)) {
        return true;
      }
      return false;
    }
  }


