package ivk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;

public class Gui extends JFrame{
	private String[] funcs={"Einfügen", "Suchen"};
	private JTabbedPane tabs=new JTabbedPane();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Gui(), 800, 500);
	}

}
