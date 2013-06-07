
public class Main {

	public static void main(String[] args) {
		Cube test = new Cube();
		writeFive(test);
		test.print();

	}

	private static void writeFive(Cube theCube) {
		theCube.fillTopRow();
		theCube.fillTopHalfOfFirstColumn();
		theCube.fillCenterRow();
		theCube.fillBottomHalfOfLastColumn();
		theCube.fillBottomRow();
		
	}

}
