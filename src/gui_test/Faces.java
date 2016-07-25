package gui_test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;

public class Faces extends JFrame{
	private static Icon[] faces;
	private JButton jb, jb2=new JButton("Disable");
	private boolean mad=false;
	public Faces(){
		faces=new Icon[]{
				new ImageIcon(getClass().getResource("Face0.gif")),
				new ImageIcon(getClass().getResource("Face1.gif")),
				new ImageIcon(getClass().getResource("Face2.gif")),
				new ImageIcon(getClass().getResource("Face3.gif")),
				new ImageIcon(getClass().getResource("Face4.gif")),
		};
		jb=new JButton("JButton",faces[3]);
		setLayout(new FlowLayout());
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(mad){
					jb.setIcon(faces[3]);
					mad=false;
				}else{
					jb.setIcon(faces[0]);
					mad=true;
				}
				jb.setVerticalAlignment(JButton.TOP);
				jb.setHorizontalAlignment(JButton.LEFT);
			}
		});
		add(jb2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Faces(), 250,125);
	}

}
