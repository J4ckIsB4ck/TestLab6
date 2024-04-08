import java.util.Objects;

public class Student implements Comparable<Student> {
    private String nume;
    private float medie;
    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }
    public float getMedie() {
        return medie;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.hashCode(medie);
        result = prime * result + ((nume == null) ? 0 : nume.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Float.compare(medie, other.medie) == 0 && Objects.equals(nume, other.nume);
    }
    @Override
    public int compareTo(Student other) {
        return Float.compare(this.medie, other.medie);
    }
    public boolean equals(Student student) {
        return false;
    }
}
