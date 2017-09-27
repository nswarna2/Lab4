
/**
 * class.
 */
public class ReclamationProject {
  /**
   *
   * @param a a string
   * @param b a string
   * @return a string
   */
     static String doit(final String a, final String b) {
         String x = a;
         String y = b;
        if (x.length() > y.length()) {
            String c = x;
            x = y;
            y = c;
        }
        String r;
        if (x.equals(y)) {
           r = "";
        } else {
             r = "";
        }
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                            r = a.substring(i, i + j);
                    }
                  }
                }
            }
        return r;
        }
 }
