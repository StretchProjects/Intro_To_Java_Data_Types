/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Data types
 * Lecture  : http://youtu.be/v9lp6_EklHQ
 * Tutorial : http://youtu.be/pf8j2woU7uY
 * License  : None.  Do with it as you wish! :)
 */

public class Main {

	public static void main (String[] args) {
		int viewsByJohn;
		viewsByJohn = 7;
		
		float averageRating;
		averageRating = 5.5f;
		
		String message1 = "Views by John: ";
		String message2 = "Average rating: ";
		String message3 = "Is subscribed? ";
		
		boolean isSubscribed = true;
		
		System.out.println(message1 + viewsByJohn + "\n"
				+ message2 + averageRating + "\n"
				+ message3 + isSubscribed);
	}
}
