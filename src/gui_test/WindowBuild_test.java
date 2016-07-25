package gui_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;
public class WindowBuild_test extends JFrame{
	public WindowBuild_test() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel);
		
		Button button = new Button("New button");
		getContentPane().add(button);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		getContentPane().add(lblNewLabel_1);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane()}));
	}

}
