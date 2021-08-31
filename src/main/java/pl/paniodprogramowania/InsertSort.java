package pl.paniodprogramowania;

// sortowanie przez wstawianie
public class InsertSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] tab) {
    int n = tab.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (tab[j] < tab[i]) {
          int tmp = tab[i];
          tab[i] = tab[j];
          tab[j] = tmp;
        }
      }
    }
    return tab;
  }
}
