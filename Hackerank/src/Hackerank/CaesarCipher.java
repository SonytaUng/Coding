package Hackerank;

//A Java Program to illustrate Caesar Cipher Technique
public class CaesarCipher
{
	 public static String encrypt(String s, int k) {
		    // Write your code here
		        String result = "";
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            char encrypt = ch;
		            if (Character.isUpperCase(ch)) {
		                encrypt = (char) ('A' + (ch - 'A' + k) % 26);
		            }
		            if (Character.isLowerCase(ch))  {
		                encrypt = (char) ('a' + (ch - 'a' + k) % 26);
		            }
		            result += encrypt;
		        }
		        return result;
		    }


  // Driver code
  public static void main(String[] args)
  {
//      String text = "ATTACKATONCE";
	  String text = "middle-Outz";
      int s = 2;
      System.out.println("Text  : " + text);
      System.out.println("Shift : " + s);
      System.out.println("Cipher: " + encrypt(text, s));
  }
}
