import java.io.*;

public class diamond{
	public static void main(String[] args){
		int count;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			count = Integer.parseInt(in.readLine());
			for(int i=1; i<=count; i++){
				for(int j=0; j<count-i; j++)
					System.out.print(" ");
				for(int k=1; k<=i*2-1; k++)
					System.out.print("*");
				System.out.print("\n");
			}
			for(int i=count-1; i>=1; i--){
				for(int j=0; j<count-i; j++)
					System.out.print(" ");
				for(int k=1; k<=i*2-1; k++)
					System.out.print("*");
				System.out.print("\n");
			}
	}
		catch(IOException e){
			System.out.println("Exception caught : "+e);
		}
	}
}
