package gui_test;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;
public class TabbedPane1 extends JFrame{
	private String[] flavors={"Chocoloate","Cream","Chips","Strawberry"};
	private JTabbedPane tabs=new JTabbedPane();
	private JTextField txt=new JTextField(20);
	public TabbedPane1(){
		int i=0;
		for(String flavor:flavors)
			tabs.addTab(flavors[i],new JButton("Tabbed pane "+ i++));
		tabs.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				txt.setText("Tab selected: "+ tabs.getSelectedIndex());
			}
		});
		add(BorderLayout.SOUTH,txt);
		add(tabs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new TabbedPane1(),400,200);
	}

}
