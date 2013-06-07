
import java.util.Arrays;


public class Cube {
	public int[][] data = new int[7][7];
	public final int center = 3;
	public Point thePoint = new Point(0,0);
	public void print(){
		for(int[] i : this.data){
			System.out.println(Arrays.toString(i));
		}
	}
	public void fillTopRow(){
		thePoint.setXY(0,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<7;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillLeftHalfOfTopRow(){
		thePoint.setXY(0,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillRightHalfOfTopRow(){
		thePoint.setXY(4,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillFirstColumn(){
		thePoint.setXY(0,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<7;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillTopHalfOfFirstColumn(){
		thePoint.setXY(0,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillBottomHalfOfFirstColumn(){
		thePoint.setXY(0,4);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillLastColumn(){
		thePoint.setXY(6,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<7;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillTopHalfOfLastColumn(){
		thePoint.setXY(6,0);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillBottomHalfOfLastColumn(){
		thePoint.setXY(6,4);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wy++;
		}
	}
	public void fillCenterRow(){
		thePoint.setXY(0,3);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<7;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillLeftHalfOfCenterRow(){
		thePoint.setXY(0,3);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillRightHalfOfCenterRow(){
		thePoint.setXY(4,3);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillBottomRow(){
		thePoint.setXY(0,6);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<7;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillLeftHalfOfBottomRow(){
		thePoint.setXY(0,6);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	public void fillRightHalfOfBottomRow(){
		thePoint.setXY(4,6);
		int wx = thePoint.getX();
		int wy = thePoint.getY();
		for(int i=0;i<3;i++){
			data[wy][wx] = 1;
			wx++;
		}
	}
	
	public void writeFive(int theX,int theY){ //x and y are the top left starting point for the five
		int x=theX;
		int y =theY;
		int cx = x; //current x
		int cy = y; //current y
		for(int i=0;i<3;i++){
			this.data[cy][cx] = 1;
			cx++;
		}//write flag. 3 can be a variable for its length
		cy++;
		cx=x;
		for(int i=0;i<1;i++){
			this.data[cy][cx] = 1;
			cy++;
		}// the fives torso
		for(int i=0;i<3;i++){
			this.data[cy][cx] = 1;
			cx++;
		}
	}
	
	
}
