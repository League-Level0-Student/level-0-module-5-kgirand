
public class ForLoopGauntlet {
public static void main(String[] args) {
////1
//	for(int a = 0; a<101;a++) {
//		System.out.println("1." + a);
//	}
////2
//	for(int b = 100; b>0; b--) {
//		System.out.println("2."+ b);
//	}
////3
//	for(int c = 1; c<100; c++) {
//		if(c%2==0) {
//			System.out.println("3." + c);
//		}
//	}
////4
//	for(int d = 0; d<100; d++) {
//		if(d%2==1) {
//			System.out.println("4." + d);
//		}
//	}
////5
//	for(int i = 1; i<501; i++) {
//		if(i%2==0) {
//			System.out.println(i + " Even");
//		}
//		if(i%2==1) {
//			System.out.println(i + " Odd");
//		}
//	}
////6	for(int i = 7; i<778; i++) {
//		if(i%7==0) {
//			System.out.println(i);
//		
//	}
//	}
//	
////7	for(int i = 2005; i<=2019; i++) {
//		System.out.println("In " + i +" I was " + (i-2005) + " years old.");
//	}
////1	for(int i = 0; i<3; i++) {
//		for(int j = 0; j<3; j++) {
//			System.out.println(i + " " + j);
//		}
//	}
////2	for(int i = 0; i<3; i++) {
//			for(int j = 1; j<4; j++) {
//			System.out.print((i*3) + j);
//		}
//				System.out.println("");
//	}
		for(int i = 0; i< 100; i++) {
			for(int j = 1; j<101; j++) {
				System.out.print((i*10) + j);
			}
					System.out.println("");
		}
		

}
}