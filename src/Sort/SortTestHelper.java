package Sort;



public class SortTestHelper {

	public int[] generateRandomArray(int n, int rangeL, int rangeR) {
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
            	arr[i] =(int) (Math.random()*(rangeR-rangeL)+1);
            }
            return arr;
	}
	
	//���ɽ������������
	public int[] generateNearlyOrderedArray(int n ,int swapTimes){
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = i;
		}
		for(int i = 0;i<swapTimes;i++){
			int posx = (int)(Math.random()*n);
			int posy = (int)(Math.random()*n);
			SelectSort.swap(arr, posx, posy);
		}
		return arr;
	}
	
	//����ѡ������ʱ��
	public void testSelectSort(String sortName,int n,int[] arr,SelectSort sort){
		double start = System.currentTimeMillis();
		sort.selectSort(arr, n);
		double end = System.currentTimeMillis();
		
		System.out.println(sortName+":"+((end-start)/1000)+"s");
	}
	
	//���Բ�������ʱ��
	public void testInsertSort(String sortName,int n,int[] arr,SelectSort sort){
		double start = System.currentTimeMillis();
		sort.insertSort(arr, n);
		double end = System.currentTimeMillis();
		
		System.out.println(sortName+":"+((end-start)/1000)+"s");
	}
	
	//���ԸĽ���Ĳ�������
	public void testInsertSort2(String sortName,int n,int[] arr,SelectSort sort){
		double start = System.currentTimeMillis();
		sort.insertSort2(arr, n);
		double end = System.currentTimeMillis();
		System.out.println(sortName+":"+((end-start)/1000)+"s");
	}
	
	//���ԸĽ�����۰��������
	public void testInsertSort3(String sortName,int n,int[] arr,SelectSort sort){
		double start = System.currentTimeMillis();
		sort.insertSort3(arr, n);
		double end = System.currentTimeMillis();
		System.out.println(sortName+":"+((end-start)/1000)+"s");
	}
	
	public boolean isSort(int n,int[] arr){
		for(int i = 1;i<n;i++){
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}
}
