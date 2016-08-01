package gui_test;
import javax.swing.*;
import javax.swing.SpringLayout;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.run;
public class SpringLayout1 extends JFrame{

	public static void main(String[] args){
		JFrame f=new JFrame();
		String[] labels = {"Name: ", "Fax: ", "Email: ", "Address: "};
		int numPairs = labels.length;

		//Create and populate the panel.
		JPanel b=new JPanel(new SpringLayout());
		JPanel p = new JPanel(new SpringLayout());
		for (int i = 0; i < numPairs; i++) {
		    JLabel l = new JLabel(labels[i], JLabel.TRAILING);
		    p.add(l);
		    JTextField textField = new JTextField(5);
		    l.setLabelFor(textField);
		    p.add(textField);
		}
		for (int i = 0; i < numPairs; i++) {
		    JLabel l1 = new JLabel(labels[i], JLabel.TRAILING);
		    b.add(l1);
		    JTextField textField1 = new JTextField(5);
		    l1.setLabelFor(textField1);
		    b.add(textField1);
		}

		//Lay out the panel.
		SpringUtilities.makeCompactGrid(p,
		                                numPairs, 2, //rows, cols
		                                6, 6,        //initX, initY
		                                6, 6);       //xPad, yPad
		SpringUtilities.makeCompactGrid(b,
                numPairs, 2, //rows, cols
                150, 6,        //initX, initY
                6, 6);       //xPad, yPad
		f.setLayout(new SpringLayout());
		f.add(p);
		f.add(b);
		run(f,800,400);
	}
}
