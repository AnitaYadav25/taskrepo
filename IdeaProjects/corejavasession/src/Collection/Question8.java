package Collection;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Question8 {


        public static void main(String[] args) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");

            LocalDateTime date = LocalDateTime.now();
            System.out.println("the date is");
            System.out.println(dtf.format(date));

        }
}
