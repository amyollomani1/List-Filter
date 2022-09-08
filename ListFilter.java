import java.util.Arrays;

public class ListFilter {
	public static void main(String[] args) {
		// read the valid list into an int array
		//this is the valid key
		//in scans txt and puts ints into an array
		In in = new In("https://gist.githubusercontent.com/david-dobor/8e72f21c733b677af60f35086e65924f/raw/2e6e4daa0b019b22de38b9e6572af29cf19b6139/valid1M.txt");
		int[] a = in.readAllInts();
		//System.out.println(Arrays.toString(a));

		// create a CollectionOfInts object that can process the input
		// sorts array
		CollectionOfInts collection = new CollectionOfInts(a);

		// read the data that needs to be filtered
		//this is contender
		in = new In("https://gist.githubusercontent.com/david-dobor/ac1a8528a0b8a5a88e41777c56e51bc4/raw/f7a65a9682f186ce25d2e9e2f6aa95b664c90c72/contenders1M.txt");
		int[] keys = in.readAllInts();
		//System.out.println(Arrays.toString(keys));


		// Now filter the list by relying on the CollectionOfInts API
		//prints key (ints) that aren't in valid.txt
		for (int key : keys)
			if (!collection.contains(key))
				System.out.println(key);
	    }
}
