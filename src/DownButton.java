import java.awt.Point;

public class DownButton extends DrawButton{

	public DownButton(int x, int y, Cursor cursor) {
		super(x, y, cursor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Point computeNextPoint(Point lastPoint) {
		// TODO Auto-generated method stub
		return new Point(lastPoint.x,lastPoint.y+5);
	}
	
}
