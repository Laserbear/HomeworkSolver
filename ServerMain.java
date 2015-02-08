import java.io.PrintWriter;

public class ServerMain {
	public static void main(String[] args) throws Exception {
		Thread.sleep(30*1000/60);
		//Server.pull();
		System.out.println("oh shit!!!");
		WolframTesseract wt = new WolframTesseract();
		
		String equ 		= wt.getEquation("C:/Users/Tehas_2/Desktop/images2.jpg");
		String result	= wt.solveEquation(equ);
		
		PrintWriter writer = new PrintWriter("C:/Users/Tehas_2/Desktop/result.txt", "UTF-8");
		writer.println(result);
		writer.close();
		
		//Server.push();
		System.out.println("oh shit!!!");
	}
}
