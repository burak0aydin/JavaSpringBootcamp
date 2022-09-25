public class Exercise2_3PerfectNumber {

	public static void main(String[] args) {
		int number = 27;
		int total = 0;
		
		for (int i = 1; i < number; i++) 
		{
			if (number % i == 0)
				total += i;
		}
		if (total == number)
			System.out.println("It is PerfectNumber!");
		else
			System.out.println("It is not PerfectNumber!");

	}

}
