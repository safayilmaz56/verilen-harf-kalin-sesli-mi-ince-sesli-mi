package kalinSesliMiInceSesliMi;

public class Main {

	public static void main(String[] args) {

		char ch = 'C';
		switch(ch) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("harfimiz kalin sesli bir harftir");
			break;
			default:
				System.out.println("harfimiz ince sesli bir harftir");
				break;
		}
	}

}
