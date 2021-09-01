package pl.paniodprogramowania;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MergeSortTest {

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 100, 1000, 10_000, 100_000})
  public void shouldSort(int n) {
    //given
    int[] array = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      array[i] = random.nextInt(100);
    }

    //when
    int[] result = new MergeSort().sort(array);

    //then
    for (int i = 0; i < n - 1; i++) {
      assertTrue(result[i] <= result[i + 1]);
    }
  }

}