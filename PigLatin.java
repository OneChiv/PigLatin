//import
import java.util.Scanner;

//class declaration
public class PigLatin {
public static void main (String[]args) {
Scanner kb = new Scanner(System.in);

//prompt
System.out.println("Please enter a word");

//variable declaration
String word;
word = kb.next();
char one;
one = word.charAt(0);
char two;
two = word.charAt(1);

//profit!

//vowels
if (one==('a')) {
	
}

else if (one==('e')) {

	System.out.println(word + "-way" );
}


else if (one==('i')) {
	System.out.println(word + "-way" );
}

else if (one==('o')) {
	System.out.println(word + "-way" );
}


else if (one==('u')) {
	System.out.println(word + "-way" );
}

//Vowels
else if (one==('A')) {
	System.out.println(word + "-way" );
}

else if (one==('E')) {
	System.out.println(word + "-way" );
}

else if (one==('I')) {
	System.out.println(word + "-way" );
}

else if (one==('O')) {
	System.out.println(word + "-way" );
}

else if (one==('U')) {
	System.out.println(word + "-way" );
}

//Th
else if (one==('T')&&two==('h')) {
	String pig;
	pig=word.substring(1) + word.charAt(0);
	pig=(pig.substring(1)+pig.charAt(0));
	pig=(pig+"-ay");
	System.out.println(pig);
}

//th
else if (one==('t')&&two==('h')) {
	String pig;
	pig=word.substring(1) + word.charAt(0);
	pig=(pig.substring(1)+pig.charAt(0));
	pig=(pig+"-ay");
	System.out.println(pig);
}


//basic
else {
	String pig;
	pig=word.substring(1) + word.charAt(0);
	pig=(pig+"-ay");
	System.out.println(pig);
}
kb.close();
}
}