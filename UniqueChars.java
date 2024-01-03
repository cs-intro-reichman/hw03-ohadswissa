/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
         String r = "" + (s.charAt(0));
         int i = 1;
        while (i < s.length())
        {
           char ch = s.charAt(i);
           if ((r.indexOf(ch) == -1) && (ch != ' '))
        {
           r += ch;
        }
        if (ch == ' ')
         {
             r += ch;
         }

          i++;
        }
        return r;
    }
}
