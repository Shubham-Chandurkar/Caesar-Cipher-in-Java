package test;

import java.util.Scanner;

public class CipherDemo {

	static public int key;
	static public String message;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		message = sc.nextLine();
		System.out.println("Enter key value(1 - 9)");
		key = sc.nextInt();
		CipherBody obj = new CipherBody();
		obj.docipher(key , message);
		sc.close();	
	}
}

class CipherBody{
	int temp;
	public void docipher(int key , String message) {
		
		char[] array = message.toCharArray(); 
		
		for(int i = 0;i<array.length;i++) {
        int value = array[i];
        if(value !=  32) {
         temp= value + key;
         array[i] = (char) temp;
        }
		}
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}
