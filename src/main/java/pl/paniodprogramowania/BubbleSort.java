package pl.paniodprogramowania;

// sortowanie babelkowe
public class BubbleSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] tab) {
    int n = tab.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (tab[j] > tab[i]) {
          swap(tab, i, j);
        }
      }
    }
    return tab;
  }

  private void swap(int[] tab, int i, int j) {
    int tmp = tab[i];
    tab[i] = tab[j];
    tab[j] = tmp;
  }
}
