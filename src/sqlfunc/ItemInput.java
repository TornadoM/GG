package sqlfunc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class ItemInput {

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	private String user;
	private String timestamp;
	private String configuration;
	ItemInput(){
		Scanner sc=new Scanner(System.in);
		new InputInfo("User Name","Qiaoxing Dong");
		user=sc.nextLine();
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-mm-dd hh:mm");
		timestamp=format.format(date);
		new InputInfo("Configuration");
		configuration=sc.nextLine();
	}
	
}
