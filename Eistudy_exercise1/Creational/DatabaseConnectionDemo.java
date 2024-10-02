class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        connect();
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private void connect() {
        System.out.println("Connecting to database...");
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

// Usage
class DatabaseConnectionDemo {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db1 == db2);  // true
        db1.query("SELECT * FROM users");
    }
}