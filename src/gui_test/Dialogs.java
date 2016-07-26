package gui_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;
class MyDialog extends JDialog{
	public MyDialog(JFrame parent){
		super(parent, "My dialog ming", true);
		setLayout(new FlowLayout());
		add(new JLabel("Here is my dialog"));
		JButton ok=new JButton("OK");
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
		add(ok);
		setSize(150,125);
	}
}
public class Dialogs extends JFrame{
	private JButton b1=new JButton("Dialog Box jb1");
	private MyDialog dlg=new MyDialog(null);
	public Dialogs(){
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dlg.setVisible(true);
			}
		});
		add(b1);
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		run(new Dialogs(),125,75);
	}
}
