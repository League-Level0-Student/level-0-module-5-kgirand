package extra;

public class Fibinachi {
public static void main(String[] args) {
	int x = 0;
	int y = 1;
	int temp = 0;
	System.out.println(x);
	System.out.println(y);
	for(int i = 0; i<12; i++) {
		temp=x;
		x=y;
		y=temp+y;
		System.out.println(y);
	}
}
}
