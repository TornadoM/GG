package sqlfunc;
import java.util.*;
import java.sql.*;
import static net.mindview.util.Print.*;

public class SQLInsert {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.JDBC");
		Connection conn=null;
		try{
			conn=DriverManager.getConnection("jdbc:sqlite:D:/gg/FA.db");
			Statement stm=conn.createStatement();
			
			ItemInput iteminput=new ItemInput();			
			FZDInput fzdinput =new FZDInput();
			ResultSet table_count=stm.executeQuery("select * from Item");
			int count=0;
			while(table_count.next())
				count++;
			int item_ID=count+1;
			int fzd_ID=item_ID;
			int kp_ID=item_ID;
			int lkulm_ID=item_ID;
			int absg_ID=item_ID;
			int bandgsw_ID=item_ID;
			int kum_ID=item_ID;
			stm.executeUpdate("insert into Item values("+item_ID+",'"+iteminput.getUser()+"','"
			+iteminput.getTimestamp()+"',"+fzd_ID+","+kp_ID+","+lkulm_ID+","+absg_ID+","+bandgsw_ID+
			","+kum_ID+",'"+iteminput.getConfiguration()+"')");
			//stm.executeUpdate("insert into Fahrzeugdaten values("+fzdinput.getKunde()+fzdinput.getModell())")
		}catch(SQLException e){
			System.err.println(e.getMessage());
			System.exit(0);
		}
		finally{
			try{
				if (conn!=null)
					conn.close();
			}catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}
		
	}

}
