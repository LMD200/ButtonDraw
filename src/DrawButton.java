import java.awt.Point;

import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

import wheels.users.Line;

	public abstract class DrawButton extends Ellipse{
	
		private Cursor cursor;
		
		
			public DrawButton(int x, int y, Cursor cursor) {
			//Cursor telling us one single location for editing
				
				
				super(x, y);
				
				
				this.setSize(20, 20);
				
				this.cursor = cursor;
				
			}
			
			public void mousePressed(MouseEvent e) {
				this.setFillColor(java.awt.Color.blue);
				
			}
	
		public void mouseReleased(MouseEvent e) {
			
			Point lastPoint = cursor.getLocation();
			
			Point nextPoint = computeNextPoint(lastPoint);
			
			Line line = new Line(lastPoint, nextPoint);
			
			line.setThickness(2);
			
			line.setColor(java.awt.Color.black);
			
			cursor.setLocation(nextPoint);
			
			this.setColor(java.awt.Color.red);
	}
	
	public abstract java.awt.Point computeNextPoint(java.awt.Point lastPoint);
	
}
