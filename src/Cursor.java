
public class Cursor {

	private java.awt.Point location;
	
	
	public Cursor() {
		
		location = new java.awt.Point(350, 350);
		
	}
	
	
	public java.awt.Point getLocation(){
		
		return location;
		
	}
	
	public void setLocation(java.awt.Point location) {
		
		this.location = location;
	}
	
}
