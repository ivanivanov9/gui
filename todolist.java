package guiproject;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class todolist {
	public static void main(String[] args) {

		JFrame frame = new JFrame("To-do list");
		frame.setSize(100,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// main containers and Layouts
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

		JPanel leftPanel = new JPanel();
		mainPanel.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		JPanel rightPanel = new JPanel();
		mainPanel.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

		// left side
		JLabel toDoListLabel = new JLabel("To-do list");
		leftPanel.add(toDoListLabel);

		JTextArea listArea = new JTextArea();
		listArea.setBounds(100, 20, 165, 25);
		listArea.setEditable(false);
		listArea.setText("Today's tasks: ");
		leftPanel.add(listArea);

		// right side
		SimpleDateFormat ft = new SimpleDateFormat("dd. M yyyy");
		JLabel currentDateLabel = new JLabel(ft.format(new Date()));
		rightPanel.add(currentDateLabel);

		JTextField listText_1 = new JTextField();
		rightPanel.add(listText_1);
		JTextField listText_2 = new JTextField();
		rightPanel.add(listText_2);
		JTextField listText_3 = new JTextField();
		rightPanel.add(listText_3);

		JButton confirmButton = new JButton("Confirm");
		rightPanel.add(confirmButton);


		frame.pack();
		frame.setVisible(true);

	}
}
