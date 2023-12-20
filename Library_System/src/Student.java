import java.util.Objects;

// Inherited class for Student
public class Student extends LibraryUser {
    private int academicNumber;
    private String issn;

    public Student(String name, int userId, int academicNumber) {
        super(name, userId);
        this.academicNumber = academicNumber;
    }

    public int getAcademicNumber() {
        return academicNumber;
    }

    public void setAcademicNumber(int academicNumber) {
        this.academicNumber = academicNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student otherStudent = (Student) obj;
        return Objects.equals(issn, otherStudent.issn);
    }
}