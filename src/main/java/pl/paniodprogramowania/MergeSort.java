package pl.paniodprogramowania;

public class MergeSort implements SortingAlgorithm {
  @Override
  public int[] sort(int[] tab) {
    mergeSort(tab, 0, tab.length - 1);
    return tab;
  }

  private void mergeSort(int[] tab, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
      int middleIndex = (leftIndex + rightIndex) / 2;
      mergeSort(tab, leftIndex, middleIndex);
      mergeSort(tab, middleIndex + 1, rightIndex);
      merge(tab, leftIndex, middleIndex, rightIndex);
    }
  }

  private void merge(int[] tab, int leftIndex, int middleIndex, int rightIndex) {
    int lengthOfLeftArray = middleIndex - leftIndex + 1;
    int lengthOfRightArray = rightIndex - middleIndex;
    int[] leftArray = new int[lengthOfLeftArray];
    int[] rightArray = new int[lengthOfRightArray];

    for (int i = 0; i < lengthOfLeftArray; i++) {
      leftArray[i] = tab[leftIndex + i];
    }
    for (int i = 0; i < lengthOfRightArray; i++) {
      rightArray[i] = tab[middleIndex + 1 + i];
    }
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < lengthOfLeftArray && j < lengthOfRightArray) {
      if (leftArray[i] <= rightArray[j]) {
        tab[k] = leftArray[i];
        i++;
      } else {
        tab[k] = rightArray[j];
        j++;
      }
      k++;
    }

    while (i < lengthOfLeftArray) {
      tab[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < lengthOfRightArray) {
      tab[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
