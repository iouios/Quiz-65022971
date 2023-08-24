public class Student {
    private String name;
    private int ID;
    private int admissionYear;
    private double GPA;

    public Student(String name, int ID, int admissionYear, double GPA) {
        this.name = name;
        this.ID = ID;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public static void main(String[] args) {

        Student student = new Student("isawan yuenyongkun", 65022971, 65, 2.9);

        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Admission Year: " + student.getAdmissionYear());
        System.out.println("GPA: " + student.getGPA());

    }
}