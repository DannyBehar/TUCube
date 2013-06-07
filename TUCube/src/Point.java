
public class Point {
	private	int x = 0;
	private	int y= 0;
	public Point(int theX, int theY){
		this.x = theX;
		this.y = theY;
	}
	public void setX(int theX){
		this.x = theX;
	}
	public void setY(int theY){
		this.y = theY;
	}
	public void setXY(int theX, int theY){
		this.x = theX;
		this.y = theY;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
}
