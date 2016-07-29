package gui_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;
import static net.mindview.util.SwingConsole.*;

public class LongRunningTask extends JFrame{
	private JButton
		b1=new JButton("Run Long Task"),
		b2=new JButton("End Long Task");
	public LongRunningTask(){
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				try{
					TimeUnit.SECONDS.sleep(3);
				}catch(InterruptedException e){
					System.out.println("Task interrupted");
					return;
				}
				System.out.println("Task completed");
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread.currentThread().interrupt();
			}
		});
		add(BorderLayout.NORTH,b1);
		add(BorderLayout.SOUTH,b2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new LongRunningTask(),200,150);
	}

}
