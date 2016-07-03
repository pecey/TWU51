public class fizzBuzz{
	public static void main(String[] args){
		int startRange = 1;
		int endRange = 100;
		for(int i=startRange; i<=endRange; i++){
			if (i%3 == 0){
				if(i%5==0)
					System.out.println("FizzBuzz");
				else
					System.out.println("Fizz");
			}
			else if(i%5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}		
}
