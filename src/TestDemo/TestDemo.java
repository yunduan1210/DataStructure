package TestDemo;
import Heap.MaxHeap;
import Sort.*;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int n = 1000000;
	    int[] testArrRandom = new SortTestHelper().generateRandomArray(n, 0, n);
        int[] testArrNearlyOrdered = new SortTestHelper().generateNearlyOrderedArray(n, 100);


        int[] testArrSelectSort = new int[n];
        int[] testArrInsertSort1 = new int[n];
        int[] testArrInsertSort2 = new int[n];
        int[] testArrInsertSort3 = new int[n];
        int[] testArrHeapSort1 = new int[n];
        int[] testArrHeapSort2 = new int[n];
        int[] testArrHeapSort3 = new int[n];
        testArrSelectSort = (int[]) testArrRandom.clone();
        testArrInsertSort1 = (int[]) testArrRandom.clone();
        testArrInsertSort2 = (int[]) testArrRandom.clone(); // 改进后的插入排序，主要对交换上面做简化，先比较，然后再插入值
        testArrInsertSort3 = (int[]) testArrRandom.clone(); // 改进比较次数，采用折半查找，折半插入排序
        testArrHeapSort1 = (int[]) testArrRandom.clone();
        testArrHeapSort2 = (int[]) testArrRandom.clone();
        testArrHeapSort3 = (int[]) testArrRandom.clone();

//        new SortTestHelper().testSelectSort("SelectSort", n, testArrSelectSort, new SelectSort());
//        System.out.println(new SortTestHelper().isSort(n, testArrSelectSort));
//        new SortTestHelper().testInsertSort("InsertSort1", n, testArrInsertSort1, new SelectSort());
//        System.out.println(new SortTestHelper().isSort(n, testArrInsertSort1));
//        new SortTestHelper().testInsertSort2("InsertSort2", n, testArrInsertSort2, new SelectSort());
//        System.out.println(new SortTestHelper().isSort(n, testArrInsertSort2));
//        new SortTestHelper().testInsertSort3("InsertSort3", n, testArrInsertSort3, new SelectSort());
//        System.out.println(new SortTestHelper().isSort(n, testArrInsertSort3));
        new SortTestHelper().testHeapSort1("HeapSort1",n,testArrHeapSort1,new HeapSort());
        System.out.println(new SortTestHelper().isSort(n,testArrHeapSort1));
        new SortTestHelper().testHeapSort2("HeapSort2",n,testArrHeapSort2,new HeapSort());
        System.out.println(new SortTestHelper().isSort(n,testArrHeapSort2));
        new SortTestHelper().testHeapSort3("HeapSort3",n,testArrHeapSort3,new HeapSort());
        System.out.println(new SortTestHelper().isSort(n,testArrHeapSort3));



	}
}

	
