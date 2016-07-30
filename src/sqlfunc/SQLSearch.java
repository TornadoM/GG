package sqlfunc;
import java.util.*;
import java.sql.*;
import static net.mindview.util.Print.*;

public class SQLSearch {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub	
		Class.forName("org.sqlite.JDBC");
		
		Connection conn=null;
		try{
			conn=DriverManager.getConnection("jdbc:sqlite:D:/JavaWork/FA.db");
			Statement stm=conn.createStatement();
			
			Scanner sc=new Scanner(System.in);
			print("please input what you want to search:(e.g Typ or Maßstab) ");
			String reqCol=sc.nextLine();
			print("please input the value of "+reqCol);
			String reqVal=sc.nextLine();
			ResultSet rs=stm.executeQuery("select * from Fahrzeugdaten where "+reqCol+"='"+reqVal+"'");
			ResultSetMetaData rsmd=rs.getMetaData();
			int i=1;
			while(rs.next()){
				print("Data meet requirements: ");
				while(i<=rsmd.getColumnCount()){
					print(rsmd.getColumnName(i)+": "+rs.getString(i));
					i++;
				}
			}
			print("No more data meet rquirements");
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
	}

}
