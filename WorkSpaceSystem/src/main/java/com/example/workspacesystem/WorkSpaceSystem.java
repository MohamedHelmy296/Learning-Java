package com.example.workspacesystem;
import java.sql.*;
import java.util.ArrayList;

// WorkSpaceSystem class to manage the Work Space System
public class WorkSpaceSystem {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<CD> cds;

    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Staff> staff;
    private ArrayList<Visitor> visitors;

    public WorkSpaceSystem() {
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.cds = new ArrayList<>();

        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    // Methods for adding items
    public void addBook(Connection connection,Book book) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Book (title, author ,pageCount) VALUES ( ? ,?, ?)");
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor() );
            statement.setInt(3, book.getPageCount() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        books.add(book);
    }


    public void addMagazine( Connection connection, Magazine magazine) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Magazine (title, author ,version) VALUES ( ? ,?, ?)");
            statement.setString(1, magazine.getTitle());
            statement.setString(2, magazine.getAuthor() );
            statement.setInt(3, magazine.getVersion() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        magazines.add(magazine);
    }

    public void addCD( Connection connection ,CD cd) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO CD (title, author ,artist) VALUES ( ? ,?, ?)");
            statement.setString(1, cd.getTitle());
            statement.setString(2, cd.getAuthor() );
            statement.setString(3, cd.getArtist() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        cds.add(cd);
    }

    // Methods for deleting items
    public void deleteBook(Connection connection,Book book) {
        PreparedStatement statement = null;
        if (books.contains(book)){
        try {
            statement = connection.prepareStatement("Delete from Book where title = ? and author = ? and pageCount = ? ");
            statement.setString(1,book.getTitle());
            statement.setString(2,book.getAuthor());
            statement.setInt(3,book.getPageCount());
            statement.execute();
        }catch  (SQLException e) {
            throw new RuntimeException(e);
        }

            books.remove(book);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book not found in the list.");
        }
    }

    public void deleteMagazine( Connection connection,Magazine magazine) {
        PreparedStatement statement = null;
        if (magazines.contains(magazine)){
            try {
                statement = connection.prepareStatement("Delete from Magazine where title = ? and author = ? and version = ? ");
                statement.setString(1,magazine.getTitle());
                statement.setString(2,magazine.getAuthor());
                statement.setInt(3,magazine.getVersion());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }

            magazines.remove(magazine);
            System.out.println("Magazine deleted successfully.");
        } else {
            System.out.println("Magazine not found in the list.");
        }
    }

    public void deleteCD(Connection connection,CD cd) {
        PreparedStatement statement = null;
        if (cds.contains(cd)) {
            try {
                statement = connection.prepareStatement("Delete from CD where title = ? and author = ? and artist = ? ");
                statement.setString(1,cd.getTitle());
                statement.setString(2,cd.getAuthor());
                statement.setString(3,cd.getArtist());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }


            cds.remove(cd);
            System.out.println("CD deleted successfully.");
        } else {
            System.out.println("CD not found in the list.");
        }
    }

    // Methods for adding users
    public void addStudent( Connection connection,Student student) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Student (name, userId ,academicNumber ) VALUES ( ? ,?, ?)");
            statement.setString(1, student.getName());
            statement.setInt(2, student.getUserId() );
            statement.setInt(3, student.getAcademicNumber() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        students.add(student);
    }

    public void addProfessor( Connection connection,Professor professor) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Professor (name, userId ,department  ) VALUES ( ? ,?, ?)");
            statement.setString(1, professor.getName());
            statement.setInt(2, professor.getUserId() );
            statement.setString(3, professor.getDepartment() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        professors.add(professor);
    }

    public void addStaff(Connection connection,Staff staffMember) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Staff (name, userId ,position   ) VALUES ( ? ,?, ?)");
            statement.setString(1, staffMember.getName());
            statement.setInt(2, staffMember.getUserId() );
            statement.setString(3, staffMember.getPosition() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        staff.add(staffMember);
    }

    public void addVisitor(Connection connection,Visitor visitor) {
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO Visitor (name, userId ,purpose    ) VALUES ( ? ,?, ?)");
            statement.setString(1, visitor.getName());
            statement.setInt(2, visitor.getUserId() );
            statement.setString(3, visitor.getPurpose() );
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        visitors.add(visitor);
    }

    // Methods for deleting users
    public void deleteStudent(Connection connection,Student student) {
        PreparedStatement statement = null;
        if (students.contains(student)) {
            try {
                statement = connection.prepareStatement("Delete from Student where name = ? and userId = ? and academicNumber  = ? ");
                statement.setString(1,student.getName());
                statement.setInt(2,student.getUserId());
                statement.setInt(3,student.getAcademicNumber());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }

            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }
    }

    public void deleteProfessor(Connection connection,Professor professor) {
        PreparedStatement statement = null;
        if (professors.contains(professor)) {
            try {
                statement = connection.prepareStatement("Delete from Professor where name = ? and userId = ? and department   = ? ");
                statement.setString(1,professor.getName());
                statement.setInt(2,professor.getUserId());
                statement.setString(3,professor.getDepartment());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }

            professors.remove(professor);
            System.out.println("Professor deleted successfully.");
        } else {
            System.out.println("Professor not found in the list.");
        }
    }

    public void deleteStaff(Connection connection,Staff staffMember) {
        PreparedStatement statement = null;
        if (staff.contains(staffMember)) {
            try {
                statement = connection.prepareStatement("Delete from Staff where name = ? and userId = ? and position  = ? ");
                statement.setString(1,staffMember.getName());
                statement.setInt(2,staffMember.getUserId());
                statement.setString(3,staffMember.getPosition());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }

            staff.remove(staffMember);
            System.out.println("Staff member deleted successfully.");
        } else {
            System.out.println("Staff member not found in the list.");
        }
    }

    public void deleteVisitor(Connection connection,Visitor visitor) {
        PreparedStatement statement = null;
        if (visitors.contains(visitor)) {
            try {
                statement = connection.prepareStatement("Delete from Visitor where name = ? and userId = ? and purpose   = ? ");
                statement.setString(1,visitor.getName());
                statement.setInt(2,visitor.getUserId());
                statement.setString(3,visitor.getPurpose());
                statement.execute();
            }catch  (SQLException e) {
                throw new RuntimeException(e);
            }

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
                    ", Academic Number: " + student.getAcademicNumber());
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

//Connection Data base
    public Connection getConnection() {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/workspace","root", "123456789");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void fill_book(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Book");

            while (resultSet.next()) {
                Book obj = new Book();
                obj.setAuthor(resultSet.getString("author"));
                obj.setTitle(resultSet.getString("title"));
                obj.setPageCount(resultSet.getInt("pageCount"));
                books.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void fill_cd(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from CD");

            while (resultSet.next()) {
                CD obj = new CD();
                obj.setAuthor(resultSet.getString("author"));
                obj.setTitle(resultSet.getString("title"));
                obj.setArtist (resultSet.getString("artist"));
                cds.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void fill_magazine(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Magazine");

            while (resultSet.next()) {
                Magazine obj = new Magazine();
                obj.setAuthor(resultSet.getString("author"));
                obj.setTitle(resultSet.getString("title"));
                obj.setVersion (resultSet.getInt("version"));
                magazines.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void fill_student(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Student");

            while (resultSet.next()) {
                Student obj = new Student();
                obj.setName(resultSet.getString("name"));
                obj.setUserId(resultSet.getInt("userId"));
                obj.setAcademicNumber (resultSet.getInt("academicNumber"));
                students.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void fill_professor(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Professor");

            while (resultSet.next()) {
                Professor obj = new Professor();
                obj.setName(resultSet.getString("name"));
                obj.setUserId(resultSet.getInt("userId"));
                obj.setDepartment (resultSet.getString("department"));
                professors.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void fill_staff(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Staff");

            while (resultSet.next()) {
                Staff obj = new Staff();
                obj.setName(resultSet.getString("name"));
                obj.setUserId(resultSet.getInt("userId"));
                obj.setPosition (resultSet.getString("position"));
                staff.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
//create table Visitor (name varchar(30) not null, userId int primary key ,purpose varchar(30) not null );
    public void fill_visitor(Connection connection){
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from Visitor");

            while (resultSet.next()) {
                Visitor obj = new Visitor();
                obj.setName(resultSet.getString("name"));
                obj.setUserId(resultSet.getInt("userId"));
                obj.setPurpose(resultSet.getString("purpose"));
                visitors.add(obj);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }


}

