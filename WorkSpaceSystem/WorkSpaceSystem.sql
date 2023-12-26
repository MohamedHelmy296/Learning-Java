#create database workspace; 
#create table Student (name varchar(30) not null, userId int primary key ,academicNumber int not null );
#create table Professor (name varchar(30) not null, userId int primary key ,department varchar(30) not null );
#create table Visitor (name varchar(30) not null, userId int primary key ,purpose varchar(30) not null );
#create table Staff (name varchar(30) not null , userId int primary key ,position varchar(30) not null );
#create table Magazine (title varchar(30) not null, author varchar(30) not null ,version int not null);
#create table Book (title varchar(30) not null, author varchar(30) not null ,pageCount int not null );
#create table CD (title varchar(30) not null, author varchar(30) not null ,artist varchar(30) not null );

#-- Insert test data into the Student table
#insert into Student (name, userId, academicNumber) values
# ('John Doe', 1, 12345),
# ('Jane Smith', 2, 67890),
# ('Bob Johnson', 3, 54321);

#-- Insert test data into the Professor table
#insert into Professor (name, userId, department) values
#  ('Dr. Anderson', 4, 'Computer Science'),
# ('Prof. Williams', 5, 'Physics'),
# ('Dr. Davis', 6, 'History');

#-- Insert test data into the Visitor table
#insert into Visitor (name, userId, purpose) values
#  ('Alice Brown', 7, 'Research visit'),
#  ('Charlie Green', 8, 'Library tour'),
#  ('Eva White', 9, 'Meeting with staff');

#-- Insert test data into the Staff table
#insert into Staff (name, userId, position) values
#  ('Mary Johnson', 10, 'Librarian'),
#  ('James Miller', 11, 'Custodian'),
#  ('Emily Davis', 12, 'Administrative Assistant');

#-- Insert test data into the Magazine table
#insert into Magazine (title, author, version) values
#  ('Science Today', 'John Scientist', 1),
#  ('History Review', 'Sarah Historian', 2),
# ('Tech Trends', 'Alex Techie', 3);

#-- Insert test data into the Book table
#insert into Book (title, author, pageCount) values
# ('The Great Gatsby', 'F. Scott Fitzgerald', 300),
#  ('Introduction to Physics', 'Mark Physicist', 200),
# ('Data Structures and Algorithms', 'Alice Coder', 400);

#-- Insert test data into the CD table
#insert into CD (title, author, artist) values
#  ('Greatest Hits', 'Musician A', 'Band X'),
#  ('Classical Symphony', 'Composer B', 'Orchestra Y'),
# ('Rock Legends', 'Artist C', 'Band Z');