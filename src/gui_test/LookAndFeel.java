package gui_test;
import javax.swing.*;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;
public class LookAndFeel extends JFrame{
	private String[] choices=
			"Eeny Meeny Minnie Mickey Moe Larry Curly".split(" ");
	private Component[] samples={
			new JButton("JButton"),
			new JTextField("JTextField"),
			new JLabel("JLabel"),
			new JCheckBox("JCheckBox"),
			new JRadioButton("Radio"),
			new JComboBox(choices),
			new JList(choices),
	};
	public LookAndFeel(){
		super("Look And Feel");
		setLayout(new FlowLayout());
		for(Component component:samples)
			add(component);
	}
	private static void UsageError(){
		System.out.println("Usage: LookAndFeel [cross]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
