package pl.paniodprogramowania;

import static pl.paniodprogramowania.Helpers.swap;

// sortowanie babelkowe
public class BubbleSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (array[j] > array[i]) {
          swap(array, i, j);
        }
      }
    }
    return array;
  }
}
