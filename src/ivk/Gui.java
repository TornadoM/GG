package ivk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;

public class Gui extends JFrame{
	private String[] funcs={"Add New", "Search"};
	private JTabbedPane tabs=new JTabbedPane();
	public Gui(){
		int i=0;
		for (String func: funcs){
			switch(i){
				case 0:
					tabs.addTab(func, new Panel_Add());
					break;
				case 1:
					tabs.addTab(func, new Panel_Search());
					break;
			}
			i++;
		}
		add(tabs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Gui(), 800, 500);
	}

}
