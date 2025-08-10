import wheels.users.Frame;

public class MyApp extends Frame{
	
	
private DrawButton upbtn, dwnbtn, lftbtn, rtbtn;
	
	private Cursor cursor;
	
	
	public MyApp() {
		
		cursor = new Cursor();
		
		upbtn = new UpButton(350, 400, cursor);
		
		dwnbtn = new DownButton(350, 480, cursor);
		
		lftbtn = new LeftButton(300, 450, cursor);
		
		rtbtn = new RightButton(400, 450, cursor);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new MyApp();

	}

}

