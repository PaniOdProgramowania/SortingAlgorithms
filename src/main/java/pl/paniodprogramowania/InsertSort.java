package pl.paniodprogramowania;

// sortowanie przez wstawianie
public class InsertSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] tab) {
    int n = tab.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (tab[i] < tab[j]) {
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
