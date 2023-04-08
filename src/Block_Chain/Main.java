package Block_Chain;
import java.util.Date;
import java.security.MessageDigest;
public class Main {

	public static void main(String[] args) {
		Block b = new Block("Hi im the first block", "0");
		System.out.println("Hash for block 1 : " + b.hash);
		
		Block b1 = new Block("Yo im the second block",b.hash);
		System.out.println("Hash for block 2 : " + b1.hash);
		
		Block thirdBlock = new Block("Hey im the third block",b1.hash);
		System.out.println("Hash for block 3 : " + thirdBlock.hash);

	}

}
