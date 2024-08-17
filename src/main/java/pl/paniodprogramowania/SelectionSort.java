package pl.paniodprogramowania;

import static pl.paniodprogramowania.Helpers.swap;

// sortowanie przez wybor
public class SelectionSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int indexOfMinim = findIndexOfMinElement(array, i);
      swap(array, i, indexOfMinim);
    }
    return array;
  }

  private static int findIndexOfMinElement(int[] array, int startIndex){
    int indexOfMinim = startIndex;
    int minValue = array[startIndex];
    for (int j = startIndex + 1; j < array.length; j++) {
      if (array[j] < minValue) {
        indexOfMinim = j;
        minValue = array[j];
      }
    }
    return indexOfMinim;
  }
}
