import java.util.Scanner;
import java.util.Stack;

public class StackBrackect {
	private static boolean CheckBracket(String input) {
		Stack<Character> Stack =new Stack<>();
		for(char K:input.toCharArray()) 
		{
			if (K=='{' || K=='['|| K=='(') {
			Stack.push(K);
		continue;
		}
			if (Stack.isEmpty()) {
				return false;
				}
				char Z;
				switch(K) {
				case'}':
					Z=Stack.pop();
					if (Z=='[' || Z=='(') {
						return false;
						}
					break;
					case']':
						Z=Stack.pop();
						if (Z=='(' || Z=='{') {
							return false;
							}
						break;
					case')':
						Z=Stack.pop();
						if (Z=='[' || Z=='{') {
							return false;
							}
						break;
				}
			}
		return true;
		}
	

public static void main(String[] args) {
	String input="";
	System.out.println("enter the string");
	Scanner sc= new Scanner(System.in);
	input=sc.next();
	if(input.length()%2!=0) {
		System.out.println(" unbalnced");
	}
	else {
		if (CheckBracket(input)) {
			System.out.println(" The equation contain  balanced BRackects");
	}
		else {
			System.out.println("The equation does not  contain  balanced BRackects");
		}

}
}
}

