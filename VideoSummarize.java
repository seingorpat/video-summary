import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VideoSummarize{
	static JFrame frame;
	static JPanel panel;
	static JPanel non_panel;
	public static void main(String[] args) {
		frame = new JFrame("Test");
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel videofilefill = new JLabel("path: ");
        JTextField videofile = new JTextField(100);
        videofilefill.setLabelFor(videofile);
        
        JButton uni, non;
        
        uni = new JButton("uniform");
        non = new JButton("non-uniform");
        
        uni.addActionListener(new ActionListener() { 
        	  public void actionPerformed(ActionEvent e) { 
        		  uni();
        	  }
        } );
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout(0, 0, FlowLayout.LEADING));
 
        panel.add(videofilefill);
        panel.add(videofile);
        panel.add(uni);
        panel.add(non);
 
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

	public static void uni() {
		non_panel = new JPanel();
		non_panel.setLayout(new FlowLayout(0, 0, FlowLayout.LEADING));
		JLabel timefill = new JLabel("time(sec): ");
        JTextField time = new JTextField(100);
        timefill.setLabelFor(time);
        
        non_panel.add(timefill);
        non_panel.add(time);
        frame.getContentPane().add(non_panel);
		panel.hide();
	}
}