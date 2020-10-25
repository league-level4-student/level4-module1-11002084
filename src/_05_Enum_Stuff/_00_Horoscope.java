package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void chooseHoroscope(Zodiac zodiac) {
		switch(zodiac) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Use Google to find a horoscope generator");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Uhhhh you're cool I guess");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Does it look like I know how zodiacs work");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Do not smoke. Smoking is bad");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Oh that's my friend's name");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Unlock Horoscope for $19.99");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "That's a country in Africa! Oh wait... never mind one letter off");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Scorpio + n = Scorpion! Coincidence? I think not!");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "That's a long one");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Caprisun and corn... interesting meal combination");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Does this one have anything to do with water");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Pieces is a better word because it has the word pie in it");
			break;
		default:
			JOptionPane.showMessageDialog(null, "That's not a zodiac sign! At least, I don't think it is? Idk");
		}
	}
	
	// 3. Make a main method to test your method
	public static void main (String[] args) {
		_00_Horoscope horoscope = new _00_Horoscope();
		horoscope.chooseHoroscope(Zodiac.ARIES);
		horoscope.chooseHoroscope(Zodiac.TAURUS);
		horoscope.chooseHoroscope(Zodiac.GEMINI);
		horoscope.chooseHoroscope(Zodiac.CANCER);
		horoscope.chooseHoroscope(Zodiac.LEO);
		horoscope.chooseHoroscope(Zodiac.VIRGO);
		horoscope.chooseHoroscope(Zodiac.LIBRA);
		horoscope.chooseHoroscope(Zodiac.SCORPIO);
		horoscope.chooseHoroscope(Zodiac.SAGITTARIUS);
		horoscope.chooseHoroscope(Zodiac.CAPRICORN);
		horoscope.chooseHoroscope(Zodiac.AQUARIUS);
		horoscope.chooseHoroscope(Zodiac.PISCES);
	}
}
