class Hostel {
    private String hostelName;
    private int totalRooms;
    private int availableRooms;
    private int occupiedRooms;

    // Default constructor
    Hostel() {
        hostelName = "Unnamed Hostel";
        totalRooms = 0;
        availableRooms = 0;
        occupiedRooms = 0;
    }

    // Parameterized constructor with name and totalRooms
    Hostel(String name, int totalRooms) {
        hostelName = name;
        this.totalRooms = totalRooms;
        availableRooms = totalRooms;
        occupiedRooms = 0;
    }

    // Overloaded constructor with name, totalRooms, and occupiedRooms
    Hostel(String name, int totalRooms, int occupiedRooms) {
        hostelName = name;
        this.totalRooms = totalRooms;
        this.occupiedRooms = occupiedRooms;
        availableRooms = totalRooms - occupiedRooms;
    }

    // Method to admit a student to the hostel (Overloaded methods)
    public void admitStudent() {
        admitStudent("Unknown Student");
    }

    public void admitStudent(String studentName) {
        if (availableRooms > 0) {
            availableRooms--;
            occupiedRooms++;
            System.out.println(studentName + " admitted to " + hostelName);
        } else {
            System.out.println("No available rooms in " + hostelName);
        }
    }

    // Method to evict a student from the hostel (Overloaded methods)
    public void evictStudent() {
        evictStudent("Unknown Student");
    }

    public void evictStudent(String studentName) {
        if (occupiedRooms > 0) {
            availableRooms++;
            occupiedRooms--;
            System.out.println(studentName + " evicted from " + hostelName);
        } else {
            System.out.println("No students to evict in " + hostelName);
        }
    }

    // Method to display hostel information
    public void displayHostelInfo() {
        System.out.println("\nHostel Name: " + hostelName);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Occupied Rooms: " + occupiedRooms);
        System.out.println("Available Rooms: " + availableRooms);
    }
}

public class lab1 {
    public static void main(String[] args) {
        // Creating hostel objects using different constructors
        Hostel boysHostel = new Hostel("Boys Hostel", 50);
        Hostel girlsHostel = new Hostel("Girls Hostel", 40);
        Hostel mixedHostel = new Hostel("Mixed Hostel", 60, 20);

        // Displaying hostel information
        System.out.println("--------------Boys Hostel Details--------------");
        boysHostel.displayHostelInfo();
        System.out.println();

        System.out.println("--------------Girls Hostel Details--------------");
        girlsHostel.displayHostelInfo();
        System.out.println();

        System.out.println("--------------Mixed Hostel Details--------------");
        mixedHostel.displayHostelInfo();
        System.out.println();

        // Admit and evict students using overloaded methods
        boysHostel.admitStudent();
        girlsHostel.admitStudent("jagrati");
        boysHostel.evictStudent("isha");
        mixedHostel.admitStudent("jaggs");
        mixedHostel.evictStudent();

        System.out.println("--------------Updated Hostel Details--------------");
        boysHostel.displayHostelInfo();
        girlsHostel.displayHostelInfo();
        mixedHostel.displayHostelInfo();
    }
}
