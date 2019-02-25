package Collection;


   import java.text.DateFormat;
import java.util.*;
    public class Question9 {
        public static void main(String[] args) throws Exception {
            Date d1 = new Date();
            System.out.println("date is "+ d1.toString());
            Locale locItalian = new Locale("it","ch");
            Locale locFrance = new Locale("french","France");
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
            DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locFrance);
            System.out.println("date is in Switzerland Format : "+ df.format(d1));

        }
    }


