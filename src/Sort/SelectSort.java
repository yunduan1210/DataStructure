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

	// �Ľ���Ĳ���������Ҫ�Խ����������򻯣��ȱȽϣ�Ȼ���ٲ���ֵ
	public void insertSort2(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			// Ѱ��arr[i]���ʵĲ���λ��
			int e = arr[i];
			int j; // ����Ԫ��eӦ�ò����λ��
			for (j = i; j > 0 && arr[j - 1] > e; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = e;
		}
	}

	// �Ľ��Ƚϴ����������۰���ң��۰��������
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
