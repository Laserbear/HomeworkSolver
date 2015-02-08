import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;

public class Server {
	BIManagerServer server = new BIManagerServer();
	final String path = "C:/Users/Tehas_2/Desktop/";
	Thread serverThread;
	WolframTesseract wt = new WolframTesseract();
	
	public static final boolean pull() {
		
		try {
			new ProcessBuilder("adb pull /sdcard/DCIM/100MEDIA/IMAG0068.jpg C:/Users/Tehas_2/Desktop/test.jpg").start();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static final boolean push() {
		try {
			new ProcessBuilder("adb push C:/Users/Tehas_2/Desktop/result.txt /sdcard/DCIM/result.txt").start();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	//public static void main(String[] args) throws IOException {
		
		/*serverThread = new Thread() {
			ServerSocket welcomeSocket;
			public void run() {
				try {
					welcomeSocket = new ServerSocket(6789);
					print("Created socket getter!");
					Socket connectionSocket = welcomeSocket.accept();
					print("found client!");
					ObjectInputStream  in  = new ObjectInputStream(connectionSocket.getInputStream());
					ObjectOutputStream out = new ObjectOutputStream(connectionSocket.getOutputStream());
					
					server.readObject(in);
					print("got info");
					
					File outputfile = new File(path + "saved.png");
					ImageIO.write(server.getImage(), "png", outputfile);
					
					print("solving equation!");
					String equ = wt.getEquation(path + "saved.png");
					String result = wt.solveEquation(equ);
					
					print("sending results...");
					server.setText(result);
					server.writeObject(out);
					
					stopListener();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		};
		startListener();*/
	//}
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	/*public static void startListener() {
		serverThread.start();
	}
	
	public static void stopListener() {
		serverThread.interrupt();
	}*/
}
