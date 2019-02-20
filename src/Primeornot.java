
public class Primeornot {
public static void main(String[] args) {
	primeornot(17);
	boolean b = primeornot(17);
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
