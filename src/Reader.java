import java.awt.Color;
public class Reader extends Thread {
	Arduino arduino;
	public void run() {
		arduino = new Arduino("COM3",9600);
		if(arduino.openConnection())Main.frame.setTitle("connection successful");
		else Main.frame.setTitle("connection failed");
		while(Main.start) {
			String res = arduino.serialRead().replace("\n","");
			if(res!="") {
				if(res.equals("a"))Main.door1.setForeground(Color.RED);
				else if(res.equals("b"))Main.door2.setForeground(Color.RED);
				else if(res.equals("c"))Main.window1.setForeground(Color.RED);
				else if(res.equals("d"))Main.window2.setForeground(Color.RED);
			}
		}
		try {
			Reader.sleep(100);
		} catch(InterruptedException e){
			
		}
	}
}
