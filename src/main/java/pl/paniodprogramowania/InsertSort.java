package pl.paniodprogramowania;

import static pl.paniodprogramowania.Helpers.swap;

// sortowanie przez wstawianie
public class InsertSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (array[i] < array[j]) {
          swap(array, i, j);
        }
      }
    }
    return array;
  }
}
