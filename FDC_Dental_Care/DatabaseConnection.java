public class DatabaseConnection {

    // Step 2: Private static instance variable
    private static DatabaseConnection instance;

    // Step 3: Private constructor
    private DatabaseConnection() {
        // Initialization code
        // E.g., Establish database connection
    }

    // Step 4: Public static method to get the instance
    public static DatabaseConnection getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Other methods
    public void executeQuery(String query) {
        // Execute the database query
    }
}
