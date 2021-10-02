import javax.swing.*;
import java.util.*;
import BreezySwing.*;

public class prodGUI extends GBFrame{
	JLabel inputEventLabel = addLabel("Input Event:", 1, 1, 1, 1);
	JTextField inputEventField = addTextField("", 1, 2, 1, 1);
	JLabel inputTimeLabel = addLabel("Input Time (00:00):", 2, 1, 1, 1);
	JTextField inputTimeField = addTextField("", 2, 2, 1, 1);
	JCheckBox monCheck = addCheckBox("Mon", 4, 1, 1, 1);
	JCheckBox tuesCheck = addCheckBox("Tues", 4, 2, 1, 1);
	JCheckBox wedCheck = addCheckBox("Wed", 4, 3, 1, 1);
	JCheckBox thursCheck = addCheckBox("Thurs", 4, 4, 1, 1);
	JCheckBox friCheck = addCheckBox("Fri", 4, 5, 1, 1);
	JCheckBox satCheck = addCheckBox("Sat", 4, 6, 1, 1);
	JCheckBox sunCheck = addCheckBox("Sun", 4, 7, 1, 1);

	
	JButton addEvent = addButton("Add Event", 5, 1, 1, 1);
	JTextArea output = addTextArea("", 6, 1, 1, 1);
	boolean mon;
	boolean tues;
	boolean wed;
	boolean thurs;
	boolean fri;
	
	public void buttonClicked(JButton buttonObj) {
		if (buttonObj == addEvent) {
			
		}
	}
	
	
	public static void main(String[] args) {	
		JFrame frm = new prodGUI();
		frm.setTitle(" Program");
		frm.setSize(800, 800);
		frm.setVisible(true);
    }
}
