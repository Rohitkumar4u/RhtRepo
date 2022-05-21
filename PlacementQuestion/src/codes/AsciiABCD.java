package codes;

public class AsciiABCD {

	public static void main(String[] args) {
		int c=65;
		for (int i =0;i<=24; i++) {   //i<=25 to print "Z" also
			if(i%5==0) {
				System.out.println();
			}
			System.out.print((char)(i+c)+ " ");			
		}
	}

}
