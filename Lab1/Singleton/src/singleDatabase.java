class singleDatabase {
    //singleton object

    //=new singleDatabase(1,"CDCollection");
    private static singleDatabase dbObject;
    //atributes
    private int databaseID;
    private String databaseName=new String();

    //private constructor
    private singleDatabase(int databaseID, String databaseName) {
        this.databaseID=databaseID;
        this.databaseName=databaseName;
    }


    //global access to the singleton object
    public static singleDatabase getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new singleDatabase(0,"Library");
        }

        // returns the singleton object
        System.out.println("Database name is: "+dbObject.getDatabaseName());
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }



    //setters and getters
    public void setDatabaseID(int databaseID) {
        this.databaseID = databaseID;
    }

    public int getDatabaseID() {
        return databaseID;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName.toString();
    }
}


