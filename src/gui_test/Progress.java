package gui_test;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;

public class Progress extends JFrame{
	private JProgressBar pb=new JProgressBar();
	private ProgressMonitor pm=new ProgressMonitor(
			this,"Monitoring Progress","Test",0,100);
	public Progress(){
		setLayout(new GridLayout(2,1));
		add(pb);
		pm.setProgress(0);
		pm.setMillisToPopup(1000);
		sb.setValue(0);
		sb.setPaintTicks(true);
		sb.setMajorTickSpacing(20);
		sb.setMinorTickSpacing(5);
		sb.setBorder(new TitledBorder("Slide Me"));
		pb.setModel(sb.getModel());
		add(sb);
		sb.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				pm.setProgress(sb.getValue());
			}
		});
	}
	private JSlider sb=new JSlider(JSlider.HORIZONTAL,0,100,60);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new Progress(),300,200);
	}
}
