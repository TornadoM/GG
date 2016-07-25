package gui_test;
import java.util.concurrent.*;
import javax.swing.*;
public class Test extends JFrame{
	JLabel label;
	public Test(){
		super("Hello World");
		label=new JLabel("A Label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	static Test test;
	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				test=new Test();
			}
		});
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				test.label.setText("This is different");
			}
		});
	}

}
