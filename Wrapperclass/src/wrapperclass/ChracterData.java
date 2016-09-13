package wrapperclass;

public class ChracterData {
	public static void main(String[]args){
		Character c1= new Character('A');
		//using the factory method - preferred
		Character c2 = Character.valueOf('2');
		Character c3 = Character.valueOf('-');
		//Getting the wrapped char values
		char cc1=c1.charValue();
		char cc2=c1.charValue();
		char cc3=c1.charValue();
		System.out.println("c1 =" +c1);
		System.out.println("c1 =" +c2);
		System.out.println("c1 =" +c3);
		//Using some character class methods on cc1
		System.out.println("isLowercase c1 =" +Character.isLowerCase(cc1));
		System.out.println("Is the Number is Digit"+Character.isDigit(cc1));
		System.out.println("Is letter"+Character.isLetter(cc1));
		System.out.println("LowerCase of c1 ="+Character.toLowerCase(cc1));
		
		//Using some character class methods on cc2
				System.out.println("isLowercase c2 =" +Character.isLowerCase(cc2));
				System.out.println("Is the Number is Digit"+Character.isDigit(cc2));
				System.out.println("Is letter"+Character.isLetter(cc2));
				System.out.println("LowerCase of c2 ="+Character.toLowerCase(cc2));
		
				
				System.out.println("LowerCase of c3ccc ="+Character.toUpperCase(cc3));
		}
	}