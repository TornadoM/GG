package gui_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;
public class BorderLayout1 extends JFrame{
	public BorderLayout1(){
		add(BorderLayout.NORTH, new Button("North"));
		add(BorderLayout.SOUTH, new Button("South"));
		add(BorderLayout.WEST, new Button("West"));
		add(BorderLayout.EAST, new Button("East"));
		add(BorderLayout.CENTER, new Button("Center"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new BorderLayout1(),300,250);

	}

}
