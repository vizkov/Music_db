/*
basic info 0
plist 1
plist_sng 2
genre 3
status 4
album 5
album_sng 6
*/

public class dbs{
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private String query= null;
    private ArrayList<String> attributes=new ArrayList<String>();

    boolean insert_row(int x){
        try{
            switch(x){
                case 0 : query="insert into basic_info values("+ attributes.get(0)+",'"+attributes.get(1)+"',"+attributes.get(2) +",''"+attributes.get(3)+"','"+attributes.get(4)+"');";
                stmt.executeUpdate(query);
                break;
                case 1 : query ="insert into plist values("+attributes.get(0)+",'"+attributes.get(1) +"');";
                stmt.executeUpdate(query);
                break;
                case 2 : query="insert into plist_sng values("+attributes.get(0)+","+attributes.get(1)+","+attributes.get(2)+");";
                stmt.executeUpdate(query);
                break;
                case 3 : query="insert into genre values("+attributes.get(0)+","+attributes.get(1)+",'"+atributes.get(2)+"');";
                stmt.executeUpdate(query);
                break;
                case 4 : query="insert into stats values("+attributes.get(0)+","+attributes.get(1)+","+attributes.get(2)+",'"+attributes.get(3)+"','"+attributes.get(4)+"',"+attributes.get(5)+");";
                stmt.executeUpdate(query);
                break;
                case 5 : query="insert into album values("+attributes.get(0)+",'"+attributes.get(1)+"',"+attributes.get(2)+",'"+attributes.get(3)+"','"+attributes.get(4)+"',"+attributes.get(5)+");";
                stmt.executeUpdate(query);
                break;
                case 6 : query="insert into album_sng values("+attributes.get(0)+","+attributes.get(1)+","+attributes.get(2)+","+attributes.get(3)+");";
                stmt.executeUpdate(query);
                break;
                default : break;
    
            }
            return true;
        }catch(Exception e){
            e.printStackTrace(System.out);
            return false;
        }
        

    }

    boolean delete_row(int x,int s){
        try{
            switch(x){
                case 0 : query="delete from basic_info where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 1 : query="delete from plist where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 2 : query="delete from plist_sng where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 3 : query="delete from genre where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 4 : query="delete from stats where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 5 : query="delete from album where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                case 6 : query="delete from album_sng where id = "+s+";";
                stmt.executeUpdate(query);
                break;
                default : break;
    
            }
            return true;

        }catch(Exception e){
            e.printStackTrace(System.out);
            return false;
        }
        

    }

    boolean show_table(int x){
        try{
            switch(x){
                case 0 : query="select * from basic_info ;";
                rs = stmt.executeQuery(query);
                break;
                case 1 : query="select * from plist ;";
                rs = stmt.executeQuery(query);
                break;
                case 2 : query="select * from plist_sng ;";
                rs = stmt.executeQuery(query);
                break;
                case 3 : query="select * from genre ;";
                rs = stmt.executeQuery(query);
                break;
                case 4 : query="select * from stats ;";
                rs = stmt.executeQuery(query);
                break;
                case 5 : query="select * from album ;";
                rs = stmt.executeQuery(query);
                break;
                case 6 : query="select * from album_sng ;";
                rs = stmt.executeQuery(query);
                break;
                default : break;
    
            }
            return true;

        }catch(Exception e){
            e.printStackTrace(System.out);
            return false ;
        }        

    }

    boolean modify_table(){
        // ?
    }

    boolean close(){
        try{
            rs.close();
            stmt.close();
            con.close();
            return true;
        }catch(Exception e){
            e.printStackTrace(System.out);
            return false;
        }
        
    }

    void load_driver(){
        try{
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test","saks","saks");
            stmt = con.createStatement();

        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        
    }
    

}
