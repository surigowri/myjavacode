package basicsofjava_batch39;

public class Gowri_Assignment_28 {

	public static void main(String[] args) {
		// sum and average of 1 to 10 numbers

		double sum = 0;

		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			sum=sum+i;
		}

		System.out.println(sum);

		double average = sum/10;
		System.out.println(average);

	}

}
