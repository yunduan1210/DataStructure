package TestDemo;
import Sort.*;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[] testArr1 = new SortTestHelper().generateRandomArray(100000, 0, 100000);
       //int[] testArr1 = new SortTestHelper().generateNearlyOrderedArray(100000, 100);
	   
        
       int[] testArr2 = new int[100000];
       int[] testArr3 = new int[100000];
       int[] testArr4 = new int[100000];
       testArr2 = (int[]) testArr1.clone();
       testArr3 = (int[]) testArr1.clone();
       testArr4 = (int[]) testArr1.clone();
       
       new SortTestHelper().testSelectSort("SelectSort", 100000, testArr1, new SelectSort());
       System.out.println(new SortTestHelper().isSort(100000, testArr1));
       new SortTestHelper().testInsertSort("InsertSort", 100000, testArr2, new SelectSort());
       System.out.println(new SortTestHelper().isSort(100000, testArr2));
       new SortTestHelper().testInsertSort2("InsertSort2", 100000, testArr3, new SelectSort());
       System.out.println(new SortTestHelper().isSort(100000, testArr3));
       new SortTestHelper().testInsertSort3("InsertSort3", 100000, testArr4, new SelectSort());
       System.out.println(new SortTestHelper().isSort(100000, testArr3));
	}
}

	
