
public class Primeornot {
public static void main(String[] args) {
	primeornot(16);
	boolean b = primeornot(16);
	System.out.println(b);
}
static boolean primeornot(int num) {
	
for(int i=2; i<num; i++) {
	if(num%i == 0) {
	return false;	
	}

}
return true;

}
}
