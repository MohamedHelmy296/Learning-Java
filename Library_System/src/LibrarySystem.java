import java.util.ArrayList;

// LibrarySystem class to manage the library system
class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<CD> cds;

    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Staff> staff;
    private ArrayList<Visitor> visitors;

    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.cds = new ArrayList<>();

        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    // Methods for adding items
    public void addBook(Book book) {
        books.add(book);
    }


    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public void addCD(CD cd) {
        cds.add(cd);
    }

    // Methods for deleting items
    public void deleteBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found in the list.");
        }
    }

    public void deleteMagazine(Magazine magazine) {
        if (magazines.contains(magazine)) {
            magazines.remove(magazine);
            System.out.println("Magazine deleted successfully.");
        } else {
            System.out.println("Magazine not found in the list.");
        }
    }

    public void deleteCD(CD cd) {
        if (cds.contains(cd)) {
            cds.remove(cd);
            System.out.println("CD deleted successfully.");
        } else {
            System.out.println("CD not found in the list.");
        }
    }

    // Methods for adding users
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    // Methods for deleting users
    public void deleteStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }
    }

    public void deleteProfessor(Professor professor) {
        if (professors.contains(professor)) {
            professors.remove(professor);
            System.out.println("Professor deleted successfully.");
        } else {
            System.out.println("Professor not found in the list.");
        }
    }

    public void deleteStaff(Staff staffMember) {
        if (staff.contains(staffMember)) {
            staff.remove(staffMember);
            System.out.println("Staff member deleted successfully.");
        } else {
            System.out.println("Staff member not found in the list.");
        }
    }

    public void deleteVisitor(Visitor visitor) {
        if (visitors.contains(visitor)) {
            visitors.remove(visitor);
            System.out.println("Visitor deleted successfully.");
        } else {
            System.out.println("Visitor not found in the list.");
        }
    }

    // Methods for displaying items
    public void displayBooks() {
        System.out.println("\nBooks:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", Page Count: " + book.getPageCount());
        }
    }

    public void displayMagazines() {
        System.out.println("\nMagazines:");
        for (Magazine magazine : magazines) {
            System.out.println("Title: " + magazine.getTitle() + ", Author: " + magazine.getAuthor() +
                    ", Issue Number: " + magazine.getVersion());
        }
    }

    public void displayCDs() {
        System.out.println("\nCDs:");
        for (CD cd : cds) {
            System.out.println("Title: " + cd.getTitle() + ", Author: " + cd.getAuthor() +
                    ", Artist: " + cd.getArtist());
        }
    }

    // Methods for displaying users
    public void displayStudents() {
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", User ID: " + student.getUserId() +
                    ", Student ID: " + student.getAcademicNumber());
        }
    }

    public void displayProfessors() {
        System.out.println("\nProfessors:");
        for (Professor professor : professors) {
            System.out.println("Name: " + professor.getName() + ", User ID: " + professor.getUserId() +
                    ", Department: " + professor.getDepartment());
        }
    }

    public void displayStaff() {
        System.out.println("\nStaff:");
        for (Staff staffMember : staff) {
            System.out.println("Name: " + staffMember.getName() + ", User ID: " + staffMember.getUserId() +
                    ", Position: " + staffMember.getPosition());
        }
    }

    public void displayVisitors() {
        System.out.println("\nVisitors:");
        for (Visitor visitor : visitors) {
            System.out.println("Name: " + visitor.getName() + ", User ID: " + visitor.getUserId() +
                    ", Purpose: " + visitor.getPurpose());
        }
    }

}

