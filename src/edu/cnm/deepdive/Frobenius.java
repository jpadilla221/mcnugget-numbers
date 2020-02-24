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

  /**
   * Return true if the stated value can be formed as a sum of non-negative integral multiples
   * of the elements of packSizes
   * @param value
   * @param packSizes array of distinct pack sizes, in descending order.
   * @return true if value is a mcnugget number using the specific pack sizes, otherwise false.
   */

    public static boolean isGeneralMcNugget(int value, int[]packSizes) {
      boolean flag = false;
      if (packSizes.length == 1 || packSizes.length == 0)
        if (value >= 0 &&  value == 0 ||isGeneralMcNugget(value - packSizes[0], null));
        flag = true;
      for (int i = 0; i < packSizes.length ; i++) {
        int [] ithElementArray= {packSizes[i]};
        isGeneralMcNugget(value, ithElementArray);

      }
    return false;
    }
  }


