package opdracht2;


public class Mergesort {
	
	public Mergesort(){
		
	}

	//
	public static int[] sort(int[] ages) {
		sort(ages, 0, ages.length);
		return ages;
	}
	private static int[] sort(int[] ages, int left, int right) {
		if(right-left <  2) {
			return ages;
		}
		
		/*
		 * Age is een Array die leeftijden bevat. Dit zijn: {1,6,99,55,22,42,3,4};
		 * De array wordt net zo lang doormidden gesneden tot dit niet meer kan.
		 * Het getal dat kleiner is dan de median worden in een tijdelijke array gekopierd.
		 * Dit gaat net zo lang door tot de linkerdeel en vice versa gesorteerd is.
		 * O(n log n)
		 * */

		int y = (left + right) /2;
		sort(ages,left,y);
		sort(ages,y,right);
			return merge(ages,left,y,right);
	
	}
	
	private static int[] merge(int[] ages, int left, int median, int right) {
		if(ages[median-1] <= ages[median]) {
			return ages;
		}
		int all = left, j = median, i = 0;
		int[] tempArr =  new int[right-left];
		while(all <median && j<right) {
			tempArr[i++] = ( ages[all]<=ages[j] ? ages[all++] : ages[j++]);
		}
		System.arraycopy(ages, all, ages, left+i, median-all);
		System.arraycopy(tempArr, 0, ages, left, i);
		return ages;		
		
	}
}
