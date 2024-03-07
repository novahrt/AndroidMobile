public class Students {
    private String name;
    private String nim;
    private double gpa;

    public Students(String name, String nim, double gpa) {
        this.name = name;
        this.nim = nim;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nim='" + nim + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}