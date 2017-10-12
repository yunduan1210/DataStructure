package Sort;

public class SelectSort {

	public void selectSort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] > arr[j])
					swap(arr, i, j);
			}

		}
	}

	public void insertSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1])
					swap(arr, j, j - 1);
				else
					break;
			}
		}
	}

	// 改进后的插入排序，主要对交换上面做简化，先比较，然后再插入值
	public void insertSort2(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			// 寻找arr[i]合适的插入位置
			int e = arr[i];
			int j; // 保存元素e应该插入的位置
			for (j = i; j > 0 && arr[j - 1] > e; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = e;
		}
	}

	// 改进比较次数，采用折半查找，折半插入排序
	public void insertSort3(int[] arr, int n) {
		int low, high, mid;
		for (int i = 1; i < n; i++) {
			int e = arr[i];
			low = 0;
			high = i-1;
			while (low <= high) {
				mid = (low + high) / 2;
				if (arr[mid] > arr[i])
					high = mid - 1;
				else
					low = mid + 1;
			}
			for (int j = i - 1; j >= high+1; j--) {
				arr[j + 1] = arr[j];
			}
			arr[high+1] = e;
		}

	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void display(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "  ");
	}

}
