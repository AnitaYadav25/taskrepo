package Collection;

import java.util.Comparator;

public class Studentsort implements Comparator<Question5> {

    @Override
    public int compare(Question5 o1, Question5 o2) {
        int o4 = 0;
        int s;
        if (o1.score != o2.score) {
            double o3 = o1.score - o2.score;
            o4 = (int) o3;
            return o4;

        }
        if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }

        return 0;
    }
    }

