package pl.paniodprogramowania;

import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
  @Override
  public int[] sort(int[] tab) {
    return mergeSort(tab);
  }

  public static int[] mergeSort(int[] array) {
    int n = array.length;
    int[] leftArray = Arrays.copyOfRange(array, 0, n / 2);
    int[] rightArray = Arrays.copyOfRange(array, n / 2, array.length);

    if (leftArray.length > 1) {
      leftArray = mergeSort(leftArray);
    }

    if (rightArray.length > 1) {
      rightArray = mergeSort(rightArray);
    }
    return merge(leftArray, rightArray);
  }

  public static int[] merge(int[] leftArray, int[] rightArray) {
    int leftArrayLength = leftArray.length;
    int rightArrayLength = rightArray.length;
    int[] result = new int[leftArrayLength + rightArrayLength];
    int rightIndex = 0;
    int leftIndex = 0;
    int resultIndex = 0;

    while (leftIndex < leftArrayLength && rightIndex < rightArrayLength) {
      if (leftArray[leftIndex] < rightArray[rightIndex]) {
        result[resultIndex] = leftArray[leftIndex];
        resultIndex++;
        leftIndex++;
      } else {
        result[resultIndex] = rightArray[rightIndex];
        resultIndex++;
        rightIndex++;
      }
    }
    while (rightIndex < rightArrayLength) {
      result[resultIndex] = rightArray[rightIndex];
      resultIndex++;
      rightIndex++;
    }
    while (leftIndex < leftArrayLength) {
      result[resultIndex] = leftArray[leftIndex];
      resultIndex++;
      leftIndex++;
    }
    return result;
  }
}
