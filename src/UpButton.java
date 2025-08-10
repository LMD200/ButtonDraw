import java.awt.Point;

public class UpButton extends DrawButton{

	public UpButton(int x, int y, Cursor cursor) {
		super(x, y, cursor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Point computeNextPoint(Point lastPoint) {
		// TODO Auto-generated method stub
		return new Point(lastPoint.x,lastPoint.y-5);
	}
	
}
