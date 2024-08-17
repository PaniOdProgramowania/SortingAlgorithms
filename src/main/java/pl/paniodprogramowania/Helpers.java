package pl.paniodprogramowania;

public class Helpers {

  public static void swap(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
}
