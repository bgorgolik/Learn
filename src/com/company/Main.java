
package com.company;

public class Main {

    public static void main(String[] args) {
	String a = "Stefan";
	String b = "Edek";
	String c = "Janusz";
	String[] tab = new String[]{a, b, c};


	for( int i = 0 ; i<tab.length ; i++ ){
		java.util.Random random = new java.util.Random();
		int randomName = random.nextInt(tab.length);
		System.out.println(tab[randomName]);

		}
    }
}
