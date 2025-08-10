import java.awt.Point;

public class LeftButton extends DrawButton{

	public LeftButton(int x, int y, Cursor cursor) {
		super(x, y, cursor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Point computeNextPoint(Point lastPoint) {
		// TODO Auto-generated method stub
		return new Point (lastPoint.x-5,lastPoint.y);
	}

}
