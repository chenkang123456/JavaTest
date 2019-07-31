package QuickSort;
import java.util.Arrays;
public class TestQuickSort {
	public static void main(String[] args) {
		QuickSort qs=new QuickSort();
		int[] arr={2,5,1,5,10,13,21,14,76,100,123,23};
		qs.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
