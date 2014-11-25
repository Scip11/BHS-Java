public class BubbleSort{

	public static int[] sort(int[] a){
		for (int i = 0; i < a.length -1; i++){
			if(a[i] > a[i+1]){
				int temp;
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		return a;
	}
}