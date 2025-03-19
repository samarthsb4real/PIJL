// Main.java

class AgeException extends Exception {
	public static void checkage(int age) throws AgeException {
		if(age < 18){
			throw new AgeException("Age is less than 18");
		}		
		else {
			System.out.println("Valid.");
		}
	}

	public static void main(String args[]){

	int age = 12;

	try {
		checkage(age);
	}
	catch(AgeException e) {
		System.out.println(e);
	}

	}
}