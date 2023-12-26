package com.example.workspacesystem;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of the workspacesystem
        WorkSpaceSystem workSpaceSystem = new WorkSpaceSystem();
        Connection connection = workSpaceSystem.getConnection();
        workSpaceSystem.fill_book(connection);
        workSpaceSystem.fill_cd(connection);
        workSpaceSystem.fill_magazine(connection);
        workSpaceSystem.fill_student(connection);
        workSpaceSystem.fill_professor(connection);
        workSpaceSystem.fill_staff(connection);
        workSpaceSystem.fill_visitor(connection);

        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. Add Book");
                System.out.println("2. Add Magazine");
                System.out.println("3. Add CD");
                System.out.println("4. Add Student");
                System.out.println("5. Add Professor");
                System.out.println("6. Add Staff");
                System.out.println("7. Add Visitor");
                System.out.println("8. Display from Work Space Items");
                System.out.println("9. Display from Work Space Users");
                System.out.println("10. Delete from Work Space Items");
                System.out.println("11. Delete from Work Space Users");
                System.out.println("0. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.println("Enter Book details:");
                        System.out.println("Title:");
                        String titleB = scanner.nextLine();
                        System.out.println("author:");
                        String authorB = scanner.nextLine();
                        System.out.println("pageCount:");
                        int pageCount = scanner.nextInt();
                        Book book = new Book(titleB, authorB, pageCount);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addBook(connection,book);
                        break;

                    case 2:
                        System.out.println("Enter Magazine details:");
                        System.out.println("Title:");
                        String titleM = scanner.nextLine();
                        System.out.println("author:");
                        String authorM = scanner.nextLine();
                        System.out.println("version:");
                        int version = scanner.nextInt();
                        Magazine magazine = new Magazine(titleM, authorM, version);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addMagazine(connection,magazine);
                        break;
                    case 3:
                        System.out.println("Enter CD details:");
                        System.out.println("Title:");
                        String titleC = scanner.nextLine();
                        System.out.println("author:");
                        String authorC = scanner.nextLine();
                        System.out.println("artist:");
                        String artist = scanner.nextLine();
                        CD cd = new CD(titleC, authorC, artist);
                        workSpaceSystem.addCD(connection,cd);
                        break;
                    case 4:
                        System.out.println("Enter Student details:");
                        System.out.println("name:");
                        String nameS = scanner.nextLine();
                        System.out.println("userId:");
                        int userId = scanner.nextInt();
                        System.out.println("academicNumber:");
                        int academicNumber = scanner.nextInt();
                        Student student = new Student(nameS, userId, academicNumber);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addStudent(connection,student);
                        break;
                    case 5:
                        System.out.println("Enter Professor details:");
                        System.out.println("name:");
                        String nameP = scanner.nextLine();
                        System.out.println("department:");
                        String department = scanner.nextLine();
                        System.out.println("userId:");
                        int userP = scanner.nextInt();
                        Professor professor = new Professor(nameP, userP, department);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addProfessor( connection,professor);
                        break;
                    case 6:
                        System.out.println("Enter Staff details:");
                        System.out.println("name:");
                        String nameSt = scanner.nextLine();
                        System.out.println("userId:");
                        int userSt = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.println("position:");
                        String position = scanner.nextLine();
                        Staff staff = new Staff(nameSt, userSt, position);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addStaff(connection,staff);
                        break;
                    case 7:
                        System.out.println("Enter Visitor details:");
                        System.out.println("name:");
                        String nameV = scanner.nextLine();
                        System.out.println("userId:");
                        int userV = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.println("purpose:");
                        String purpose = scanner.nextLine();
                        Visitor visitor = new Visitor(nameV, userV, purpose);
                        scanner.nextLine(); // Consume the newline character
                        workSpaceSystem.addVisitor(connection,visitor);
                        break;
                    case 8:
                        // Display Work Space Items
                        System.out.println("which Work Space Items want to display");
                        System.out.println("1. Book");
                        System.out.println("2. Magazine");
                        System.out.println("3. CD");
                        int d_choice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (d_choice) {
                            case 1:
                                workSpaceSystem.displayBooks();
                                break;
                            case 2:
                                workSpaceSystem.displayMagazines();
                                break;
                            case 3:
                                workSpaceSystem.displayCDs();
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                                break;
                        }
                        break;
                    case 9:
                        // Display Work Space Users
                        System.out.println("which Work Space Users want to display");
                        System.out.println("1. Student");
                        System.out.println("2. Professor");
                        System.out.println("3. Staff");
                        System.out.println("4. Visitor");
                        int u_choice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (u_choice) {
                            case 1:
                                workSpaceSystem.displayStudents();
                                break;
                            case 2:
                                workSpaceSystem.displayProfessors();
                                break;
                            case 3:
                                workSpaceSystem.displayStaff();
                                break;
                            case 4:
                                workSpaceSystem.displayVisitors();
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                                break;
                        }
                        break;
                    case 10:
                        // Delete Work Space Item
                        System.out.println("Choose the type of item to delete:");
                        System.out.println("1. Book");
                        System.out.println("2. Magazine");
                        System.out.println("3. CD");
                        int Choice_D = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (Choice_D) {
                            case 1:
                                System.out.println("Enter the details of the book to delete:");
                                System.out.println("Title: ");
                                String bookTitle = scanner.nextLine();
                                System.out.println("Author: ");
                                String bookAuthor = scanner.nextLine();
                                System.out.println("Page Count: ");
                                int pageCount_ = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteBook(connection,new Book(bookTitle, bookAuthor, pageCount_));
                                break;
                            case 2:
                                System.out.println("Enter the details of the magazine to delete:");
                                System.out.println("Title: ");
                                String magazineTitle = scanner.nextLine();
                                System.out.println("Author: ");
                                String magazineAuthor = scanner.nextLine();
                                System.out.println("version: ");
                                int version_ = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteMagazine(connection,new Magazine(magazineTitle, magazineAuthor, version_));
                                break;
                            case 3:
                                System.out.println("Enter the details of the CD to delete:");
                                System.out.println("Title: ");
                                String cdTitle = scanner.nextLine();
                                System.out.println("Author: ");
                                String cdAuthor = scanner.nextLine();
                                System.out.println("Artist: ");
                                String artist_ = scanner.nextLine();
                                workSpaceSystem.deleteCD(connection ,new CD(cdTitle, cdAuthor, artist_));
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                        break;
                    case 11:
                        // Delete Work Space User
                        System.out.println("Choose the type of user to delete:");
                        System.out.println("1. Student");
                        System.out.println("2. Professor");
                        System.out.println("3. Staff");
                        System.out.println("4. Visitor");
                        int userChoice_D = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        switch (userChoice_D) {
                            case 1:
                                System.out.println("Enter the details of the student to delete:");
                                System.out.println("Name: ");
                                String studentName = scanner.nextLine();
                                System.out.println("User ID: ");
                                int studentUserId = scanner.nextInt();
                                System.out.println("Student ID: ");
                                int studentId = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteStudent(connection ,new Student(studentName, studentUserId, studentId));
                                break;
                            case 2:
                                System.out.println("Enter the details of the professor to delete:");
                                System.out.println("Name: ");
                                String professorName = scanner.nextLine();
                                System.out.println("User ID: ");
                                int professorUserId = scanner.nextInt();
                                System.out.println("Department: ");
                                String department_ = scanner.nextLine();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteProfessor(connection,new Professor(professorName, professorUserId, department_));
                                break;
                            case 3:
                                System.out.println("Enter the details of the staff member to delete:");
                                System.out.println("Name: ");
                                String staffName = scanner.nextLine();
                                System.out.println("User ID: ");
                                int staffUserId = scanner.nextInt();
                                System.out.println("Position: ");
                                String position_ = scanner.nextLine();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteStaff(connection,new Staff(staffName, staffUserId, position_));
                                break;
                            case 4:
                                System.out.println("Enter the details of the visitor to delete:");
                                System.out.println("Name: ");
                                String visitorName = scanner.nextLine();
                                System.out.println("User ID: ");
                                int visitorUserId = scanner.nextInt();
                                System.out.println("Purpose: ");
                                String purpose_ = scanner.nextLine();
                                scanner.nextLine(); // Consume the newline character
                                workSpaceSystem.deleteVisitor(connection,new Visitor(visitorName, visitorUserId, purpose_));
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                        break;
                    case 0:
                        System.out.println("Exiting the program. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }  catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }
}