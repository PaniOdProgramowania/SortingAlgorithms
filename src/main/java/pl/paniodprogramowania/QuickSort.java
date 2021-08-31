package pl.paniodprogramowania;

public class QuickSort implements SortingAlgorithm {

  @Override
  public int[] sort(int[] tab) {
    quickSort(tab, 0, tab.length - 1);
    return tab;
  }

  private void quickSort(int[] tab, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
      int pivotIndex = partition(tab, leftIndex, rightIndex);

      quickSort(tab, leftIndex, pivotIndex - 1);
      quickSort(tab, pivotIndex + 1, rightIndex);
    }
  }

  private int partition(int[] tab, int leftIndex, int rightIndex) {
    int pivot = tab[rightIndex];
    int indexOfElementLowerThenPivot = leftIndex - 1;

    for (int i = leftIndex; i < rightIndex; i++) {
      if (tab[i] <= pivot) {
        indexOfElementLowerThenPivot++;
        int tmp = tab[indexOfElementLowerThenPivot];
        tab[indexOfElementLowerThenPivot] = tab[i];
        tab[i] = tmp;
      }
    }

    int tmp = tab[indexOfElementLowerThenPivot + 1];
    tab[indexOfElementLowerThenPivot + 1] = tab[rightIndex];
    tab[rightIndex] = tmp;

    return indexOfElementLowerThenPivot + 1;
  }
}
