import java.util.*;
public class question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int base = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		int result=1;
		//value of one number raised to the power of another
		
		for(int a=1;a<=power;a++) {
			result = result*base;
		}
		System.out.println(base+" raised to "+power+" is "+result);
	}

}
