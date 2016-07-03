import java.io.*;

public class rightAngle{
	public static void main(String[] args){
		int count,j;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			count = Integer.parseInt(in.readLine());
			for(int i=1; i<=count; i++){
				j=i;
				while(j-->0){
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		catch(IOException e){
			System.out.println("Exception caught : "+e);
		}
	}
}
