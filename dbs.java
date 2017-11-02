public class dbs{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    boolean insert_row(){

    }

    boolean delete_row(){

    }

    boolean show_table(){

    }

    boolean close(){

    }

    void load_driver(){
        try{
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test","saks","saks");
            stmt = con.createStatement();

        }catch(Exception e){
            System.out.print("error:    "+e);
        }
        
    }
    

}