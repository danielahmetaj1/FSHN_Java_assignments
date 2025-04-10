public class Student {
    private String emri;

    public Student(String emri) {
        this.emri = emri;
    }

    public String getEmri() {
        return emri;
    }

    @Override
    public String toString() {
        return emri;
    }
}
