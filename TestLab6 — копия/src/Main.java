import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Vlad", 8.20f);
        Student student2 = new Student("Vladimir", 7.65f);
        Student student3 = new Student("Maxim", 8.60f);
        Student student4 = new Student("Alexei", 9.0f);
        Student student5 = new Student("Alexandr", 9.0f);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        studentList.sort(Comparator.comparing(Student::getMedie).reversed());

        for (Student student : studentList) {
            System.out.println(student + ", Nota medie: " + student.getMedie());
            System.out.println("student.equals(student): " + student.equals(student));
            System.out.println("((Object)student).equals(student): " + ((Object) student).equals(student));
        }

        float medieGenerala = calculMedieGenerala(studentList);
        System.out.println("Media generală a studenților: " + medieGenerala);

        Comparator<Float> descendingFloatComparator = new Comparator<Float>() {
            @Override
            public int compare(Float f1, Float f2) {
                return Float.compare(f2, f1);
            }
        };

        Gradebook gradebook = new Gradebook(descendingFloatComparator);

        gradebook.add(student1);
        gradebook.add(student2);
        gradebook.add(student3);
        gradebook.add(student4);
        gradebook.add(student5);

        System.out.println("Gradebook:");
        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            List<Student> sortedStudents = entry.getValue();
            Collections.sort(sortedStudents);
            System.out.println("Medie: " + entry.getKey() + ", Students: " + sortedStudents);
        }

        Count list = new Count();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Total count: " + list.getTotalCount());

        List<Integer> collection = Arrays.asList(4, 5, 6);
        list.addAll(collection);

        System.out.println("Total count: " + list.getTotalCount());
    }
    public static float calculMedieGenerala(List<Student> studentList) {
        float sumaMedii = 0;
        for (Student student : studentList) {
            sumaMedii += student.getMedie();
        }
        return sumaMedii / studentList.size();
    }
}
