package Collection;

import java.util.Comparator;

public class Sortby  implements Comparator<Question4>{




        @Override
        public int compare(Question4 o1, Question4 o2) {
            double o3= o1.salary-o2.salary;
            return (int) o3;

        }
    }


