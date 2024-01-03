/** String processing exercise 1. */
public class lowercase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowercase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowercase(String s) {
        // Replace the following statement with your code
        String bigger = "";
        int i = 0;
        while (i < s.length())
        {
           char ch = s.charAt(i);
           if ((ch >= 65) && (ch <= 90))
        {
           bigger += (char)(ch + 32);
        }
        else 
        {
            bigger = bigger + ch;
        }
      
        i++;

        }
        return bigger; 
    }
}
