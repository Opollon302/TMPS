public class Main {
    public static void main(String[] args) {

        singleDatabase db1;

        // refers to the only object of Database
        db1= singleDatabase.getInstance();

        db1.getConnection();
}}
