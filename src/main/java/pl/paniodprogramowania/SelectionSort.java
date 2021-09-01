package pl.paniodprogramowania;

// sortowanie przez wybor
public class SelectionSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] tab) {
    int n = tab.length;
    for (int i = 0; i < n; i++) {
      int indexOfMinim = i;
      for (int j = i + 1; j < n; j++) {
        if (tab[j] < tab[indexOfMinim]) {
          indexOfMinim = j;
        }
      }
      swap(tab, i, indexOfMinim);
    }
    return tab;
  }

  private void swap(int[] tab, int i, int indexOfMinim) {
    int tmp = tab[i];
    tab[i] = tab[indexOfMinim];
    tab[indexOfMinim] = tmp;
  }
}
