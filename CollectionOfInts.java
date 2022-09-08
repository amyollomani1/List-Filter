import java.util.Arrays;

public class CollectionOfInts {
	private int[] a;

 	public CollectionOfInts(int[] keys) {
 		a = Arrays.copyOf(keys, keys.length); // defensive copy
 		Arrays.sort(a);
 	}

 	public boolean contains(int key) { return indexOf(key) != -1; }

 	private int indexOf(int key) {
 		// indexOf() implemented as a binary search.
 		//returns index of int thats in valid.txt
 		 int lo = 0;
 		 int hi = a.length - 1;
 		 while (lo <= hi) { // key is within a[lo...hi] or not present
 			 int mid = lo + (hi - lo) / 2;
 			 if (key < a[mid]) hi = mid - 1;
 			 else if (key > a[mid]) lo = mid + 1;
 			 else return mid;
 		 }
 		 return -1;
 	}	
 	
}
/*
- I learned about implementing binary search. I understood that binary was alot faster than linear. 
which is why it could handle the million int text. Unrelated, I learned that we can use class in with link to the website instead of having
to download the file. 
*/