import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {
    private int totalCount = 0;
    public Gradebook(Comparator<Float> comparator) {
        super(comparator);
    }
    public void add(Student student) {
        float medie = student.getMedie();
        int roundedMedie = Math.round(medie);

        if (roundedMedie >= 0 && roundedMedie <= 10) {
            putIfAbsent((float) roundedMedie, new ArrayList<>());
            get((float) roundedMedie).add(student);
            totalCount++;
        }
    }
}
