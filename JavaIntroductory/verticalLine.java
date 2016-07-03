import java.io.*;

public class verticalLine{
	public static void main(String[] args){
		int count;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			count = Integer.parseInt(in.readLine());
			while(count-->0){
				System.out.println("*");
			}
		}
		catch(IOException e){
			System.out.println("Exception caught : "+e);
		}
	}
}
