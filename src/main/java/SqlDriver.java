public class SqlDriver {
    private SqlDriver() {}


    /**
     * Initializes the Sql Driver.
     * <p>
     * Due to some weird quirk with the SQL library,
     * this must be called at least once before using
     * any SQL code.
     * <p>
     * On error, the program exits with error code 1.
     */
    public static void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            System.err.println(STR."Failed to initialize MySql Driver: \{ex}");
            System.exit(1);
        }
    }
}
