package bubble.in;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp = 0;
		for(int i=0; i<num.length; i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;

				}
			}
			System.out.println();
			for(int sort : num) {
				System.out.print(sort +" ");
			}

		}
		System.out.println("After Sorting: ");
		for(int sort : num) {
			System.out.print(sort +" ");
		}


	}

}
