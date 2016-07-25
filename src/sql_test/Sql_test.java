package sql_test;

import java.util.*;
import java.sql.*;
import static net.mindview.util.Print.*;

public class Sql_test {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Class.forName("org.sqlite.JDBC");
		
		Scanner sc=new Scanner(System.in);
		
		Connection conn=null;
		try{
			conn=DriverManager.getConnection("jdbc:sqlite:D:/gg/FA.db");
			Statement stm=conn.createStatement();
			stm.setQueryTimeout(30);
			stm.executeUpdate("drop table if exists person");
			stm.executeUpdate("create table person (id INT, name TEXT)");
			stm.executeUpdate("insert into person values(1, 'leo')");
			stm.executeUpdate("insert into person values(2, 'yuli')");
			ResultSet rs = stm.executeQuery("select * from person");
			while(rs.next()){
				print("name = " + rs.getString("name"));
				print("id= "+rs.getString("id"));
				}
		}catch(SQLException e){
			print(e.getMessage());
			System.exit(0);
		}
		finally{
			try{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e){
				print(e);
			}
		}
		print("Opened database successfully");
	}
}
