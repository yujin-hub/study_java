package codingTest;

public class coordinate {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		if(x>0 && y>0) {
			System.out.println("("+ x + ","+ y + ")" + " 제 1사분면입니다.");
		} else if(x<0 && y>0) {
			System.out.println("("+ x + ","+ y + ")" + " 제 2사분면입니다.");
		} else if(x<0 && y<0) {
			System.out.println("("+ x + ","+ y + ")" + " 제 3사분면입니다.");
		} else if(x>0 && y<0) {
			System.out.println("("+ x + ","+ y + ")" + " 제 4사분면입니다.");
		} else if(y == 0) {
			System.out.println("("+ x + ",0" + ")" + " x축 위에 있습니다.");
		} else if(x == 0) {
			System.out.println("(0," + y + ")" + " y축 위에 있습니다.");
		} else {
			System.out.println("("+ x + ","+ y + ")" + " 원점입니다.");
		}
	}

}
