// DatabaseReader class to read inputs from the database
class DatabaseReader {
    // Implement methods to read data from the database
}

// OutputPrinter class to print output to the screen and database
class OutputPrinter {
    // Implement methods to print output to the screen and database
}

// Inherited class for DVD
class DVD extends LibraryItem {
    private double duration;

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}