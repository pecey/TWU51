import java.io.*;
public class horizontalLine{
	public static void main(String[] args){	
		int count;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			count = Integer.parseInt(in.readLine());
			while (count-->0){
				System.out.print("*");
			}
		}
		catch(IOException e){
			System.out.println("Exception caught : "+e);
		}
	}
}
