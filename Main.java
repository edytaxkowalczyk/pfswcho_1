import java.lang.*;

public class Main{
	public static void main(String[] args){
		while(true){
			try {
				 Thread.sleep(5000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
      System.out.println("Kontener: Wersja 1");
		}
	}
}
