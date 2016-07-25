package sqlfunc;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import static net.mindview.util.Print.*;
public class InputInfo{
	InputInfo(String para){
		print("Please input "+para);
	}
	InputInfo(String para, String example){
		
		print("Please input "+para+" (e.g."+example+")");
	}

}
