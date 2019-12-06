
package MethodReferences;

interface Messageable1 {
	
	Message1 getMessage(String msg);

}

	class Message1
	{
	Message1(String msg){
		System.out.println(msg);
	}
	}
	public class Cons{
	public static void main(String[] args) {
		Messageable1 Hello = Message1::new;
		Hello.getMessage("Hello");

	}
	}
